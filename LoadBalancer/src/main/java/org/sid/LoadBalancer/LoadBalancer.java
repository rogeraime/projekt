package org.sid.LoadBalancer;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoadBalancer {
	
	private List<Host> hosts;
	private LoadBalanceAlgorithm algorithm;

	public void handleRequest(Request request) {
		this.algorithm.loadBalance(this.hosts, request);
	}

}
