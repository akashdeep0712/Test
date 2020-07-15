package hcltest;


public interface PriceSource {

    void addPriceListener(PriceListner listener);
    void removePriceListener(PriceListner listener);

}
