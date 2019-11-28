package com.wx.factory.abst;

public class BFactory implements Factory {
    @Override
    public Product buildProd() {
        return new BProduct();
    }
}
