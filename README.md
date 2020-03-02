# projekt
This task is to write a LoadBalancer with different distribution algorithms. The LoadBalancer has two publics methods.
The first one – the constructor – takes two arguments. The first argument is a list of hostinstances that should be load balanced. 
The second argument is the variant of loadbalancing algorithm to be used.
There is two implementation variants: the first will simply pass the requests sequentially inrotation to each of the hosts in the list. The second one will either take the first host that hasa load under 0.75 or if all hosts in the list are above 0.75, it will take the one with the lowestload.
The second method is called handleRequest(Request request) and will load balance therequest according to the variant passed on construction.
You can assume that the host instances class has the following API:public int getLoad()public void handleRequest(Request request)Task2Imagine you want to get event data from a streaming/messaging architecture into anapplication. How would you implement it if you need to feed n applications (a distributedsystem) with the same data?
