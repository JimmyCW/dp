package com.wx.observer.ob2;

public class Observer2 implements Observer {
    @Override
    public void notifyOb(int val) {
        System.out.println(" val2 = " + val);
    }
}
