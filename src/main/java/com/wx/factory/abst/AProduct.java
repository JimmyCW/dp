package com.wx.factory.abst;

public class AProduct implements Product {

    public AProduct() {
    }

    @Override
    public void prod() {
        System.out.println("a product");
    }
}
