package org.sid.LoadBalancer;

import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Host {
	
	private String name;
	
	public int getLoad() {
		
		Random random = new Random();
		return ((random.nextInt(9)+1));
	}
	
	public void handleRequest(Request request) {
	  
		/*
		 * Some instructions to handle the request
		 */
	     System.out.print("RequestSuccessfullyProcessed");
	}

}
