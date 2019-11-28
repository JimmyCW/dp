package com.wx.factory.abst;

public class BProduct implements Product {

    public BProduct() {
    }

    @Override
    public void prod() {
        System.out.println("b product");
    }
}
