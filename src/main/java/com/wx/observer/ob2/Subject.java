package com.wx.observer.ob2;

import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class Subject {

    private volatile AtomicInteger state = new AtomicInteger(0);

    private Vector<Observer> observers = new Vector<>();

    public int getState() {
        return state.intValue();
    }

    public void setState(int stateV) {
        if(stateV != state.intValue()) {
            this.state.set(stateV);
            notifyObA(stateV);
        }
    }

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void notifyObA(int val) {
        for(Observer observer : observers) {
            observer.notifyOb(val);
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.add(new Observer1());
        subject.add(new Observer2());
        subject.setState(1);
        subject.setState(2);
    }


}
