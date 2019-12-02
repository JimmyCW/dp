package com.wx.observer.ob1;

public class Observer2 implements Observer {
    @Override
    public void notifyObserver() {
        System.out.println("observer2 changed");
    }
}
