package org.sid.LoadBalancer;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import lombok.ToString;

@SpringBootTest
@ToString
class LoadBalancerApplicationTests {
	
	@Autowired
	private LoadBalanceAlgorithm loadBalanceAlgorithm;
	private List<Host> hosts = new ArrayList<>();
	private Request request;

	@Test
	public void loadBalanceTest() {
		
		//Initialization for Hosts
		hosts.add(new Host("first_host"));
		hosts.add(new Host("second_host"));
		hosts.add(new Host("third_host"));
		hosts.add(new Host("fourth_host"));
		hosts.add(new Host("fifth_host"));
		hosts.add(new Host("sixth_host"));
		
		//Initialization for Request
		request = new Request();
		request.setHeader("this is the header");
		request.setBody("this is the body");
		
		//For Sequentially hosts algorithm
		loadBalanceAlgorithm = new SequentiallyHostAlgorithmImplementation();
		loadBalanceAlgorithm.loadBalance(this.hosts, this.request);
		
		//For Selective hosts algorithm
		loadBalanceAlgorithm = new SelectiveHostAlgorithmImplementation();
        loadBalanceAlgorithm.loadBalance(this.hosts, this.request);
	
	}

}
