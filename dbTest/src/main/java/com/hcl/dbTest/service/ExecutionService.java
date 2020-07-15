package com.hcl.dbTest.service;

public interface ExecutionService {

    String buy(String security, double price, int volume);
    String sell(String security, double price, int volume);

}
