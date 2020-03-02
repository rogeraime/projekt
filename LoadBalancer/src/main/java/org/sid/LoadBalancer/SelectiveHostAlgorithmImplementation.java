package org.sid.LoadBalancer;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SelectiveHostAlgorithmImplementation implements LoadBalanceAlgorithm {

	private final static double LIMIT_VALUE = 0.75;
	private final static int MAXIMUN_LOAD_VALUE = 40;
	private int minimun_load_value = SelectiveHostAlgorithmImplementation.MAXIMUN_LOAD_VALUE;
	private Host hostToBalance;
	
	@Override
	public void loadBalance(List<Host> hosts, Request request) {
		hostToBalance = this.getHostToBalance(hosts);
		hostToBalance.handleRequest(request);
	}

	public Host getHostToBalance(List<Host> hosts) {
		
		hosts.forEach(host->{
			
			int loadValue = host.getLoad();
			
			if((loadValue/10) < LIMIT_VALUE) {
				
				hostToBalance = host;
				
			} else if(loadValue <= minimun_load_value){
				
				minimun_load_value = host.getLoad();
				hostToBalance = host;
			}
		});
		
		return hostToBalance;
	}

}
