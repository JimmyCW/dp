package com.wx.observer.ob1;

public class MySubject extends AbstractSubject {
    @Override
    public void option() {
        System.out.println("self option");
    }


    public static void main(String[] args) {
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();

        Subject subject = new MySubject();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.notifyObserver();

    }
}
