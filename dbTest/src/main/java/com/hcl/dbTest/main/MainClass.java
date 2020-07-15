package com.hcl.dbTest.main;


public class MainClass {
	
	/**
	 * Program begins here
	 */
	public static void main(String a[]) {
		   Initiator initiater = new Initiator();
	        Responder responder = new Responder();

	        initiater.addPriceListener(responder);

	        initiater.sayHello(); 
	}

}
