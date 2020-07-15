package com.hcl.dbTest.main;

import java.util.ArrayList;
import java.util.List;

import com.hcl.dbTest.listener.PriceListner;
import com.hcl.dbTest.priceSource.PriceSource;

/**
 * Implementaion of price Source
 */
public class Initiator implements PriceSource{
	    private List<PriceListner> listeners = new ArrayList<PriceListner>();

	    public void sayHello() {
	        System.out.println("Hello!!");

	        // Notify everybody that may be interested.
	        for (PriceListner hl : listeners)
	            hl.priceUpdate("IBM", 55.0);;
	    }

		@Override
		public void addPriceListener(PriceListner listener) {
			listeners.add(listener);
			
		}

		@Override
		public void removePriceListener(PriceListner listener) {
			listeners.remove(listener);
		}
}
