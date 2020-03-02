package org.sid.LoadBalancer;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SequentiallyHostAlgorithmImplementation implements LoadBalanceAlgorithm {

	@Override
	public void loadBalance(List<Host> hosts, Request request) {
		hosts.forEach(host -> {
			host.handleRequest(request);
		});
		
	}

}
