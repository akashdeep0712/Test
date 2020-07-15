package com.hcl.dbTest.main;

import com.hcl.dbTest.service.ExecutionService;

public class Trades implements ExecutionService {

	public String buy(String security, double price, int volume) {
		System.out.println("Bought "+volume +" of "+security+"at "+price);
		return security;

	}

	public String sell(String security, double price, int volume) {
		System.out.println("Sold "+volume +" of "+security+"at "+price);
		return security;
	}

}
