package com.wx.factory.abst;

public class AFactory implements Factory {
    @Override
    public Product buildProd() {
        return new AProduct();
    }
}
