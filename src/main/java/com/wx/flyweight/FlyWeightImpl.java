package com.wx.flyweight;

public class FlyWeightImpl extends FlyWeight {

    public FlyWeightImpl(String key) {
        super(key);
    }

    @Override
    void operate() {
        String key = this.getKey();
        System.out.println("a key : " + key);
    }
}
