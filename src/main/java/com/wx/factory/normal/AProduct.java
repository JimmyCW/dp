package com.wx.factory.normal;

public class AProduct implements Product{

    public AProduct() {
    }

    @Override
    public void prod() {
        System.out.println("a product");
    }
}
