package com.wx.observer.ob1;

public interface Subject {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void setValue(int value);

    void notifyObserver();

    void option();
}
