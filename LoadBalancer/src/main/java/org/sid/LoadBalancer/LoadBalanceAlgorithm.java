package org.sid.LoadBalancer;

import java.util.List;

public interface LoadBalanceAlgorithm {

	void loadBalance(List<Host> hosts, Request request);

}
