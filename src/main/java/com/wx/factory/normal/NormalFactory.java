package com.wx.factory.normal;

public class NormalFactory {

    public Product build(String type) {
        if("a".equals(type)) {
            return new AProduct();
        } else if("b".equals(type)) {
            return new BProduct();
        } else {
            return null;
        }
    }

    public static Product buildA() {
        return new AProduct();
    }

    public static Product buildB() {
        return new BProduct();
    }
}
