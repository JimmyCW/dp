package com.wx.observer.ob1;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements Subject {
    List<Observer> list = new ArrayList<>();
    private int value = 0;

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }

    @Override
    public void deleteObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        list.stream().forEach(Observer::notifyObserver);
    }

}
