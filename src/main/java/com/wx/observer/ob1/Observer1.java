package com.wx.observer.ob1;

public class Observer1 implements Observer {
    @Override
    public void notifyObserver() {
        System.out.println("observer1 changed");
    }
}
