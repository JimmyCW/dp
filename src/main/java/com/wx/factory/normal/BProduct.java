package com.wx.factory.normal;

public class BProduct implements Product{

    public BProduct() {
    }

    @Override
    public void prod() {
        System.out.println("b product");
    }
}
