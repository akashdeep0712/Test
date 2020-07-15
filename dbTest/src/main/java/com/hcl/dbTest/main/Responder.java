package com.hcl.dbTest.main;

import com.hcl.dbTest.listener.PriceListner;

public class Responder implements PriceListner {

	Trades td = new Trades();

	public void priceUpdate(String security, double price) {
		System.out.println("Hello there...Updated Price");
		double priceList[] = { 10.0, 20.0, 31.5, 33.0, 55.0, 80.5 };
		for (double prices : priceList) {
			if (security.equals("IBM") && prices < price) {
				td.buy(security, prices, 100);
			}
		}
	}

}
