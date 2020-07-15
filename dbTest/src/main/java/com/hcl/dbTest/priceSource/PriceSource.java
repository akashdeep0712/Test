package com.hcl.dbTest.priceSource;

import com.hcl.dbTest.listener.PriceListner;

public interface PriceSource {

    void addPriceListener(PriceListner listener);
    void removePriceListener(PriceListner listener);

}
