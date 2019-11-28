package com.wx.factory.abst;

public class Test {
    public static void main(String[] args) {
        Factory factory = new AFactory();
        Product product = factory.buildProd();
        product.prod();
    }
}
