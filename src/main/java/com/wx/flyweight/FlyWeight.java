package com.wx.flyweight;

public abstract class FlyWeight {

    private String key;

    public FlyWeight(String key) {
        this.key = key;
    }

    abstract void operate();

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
