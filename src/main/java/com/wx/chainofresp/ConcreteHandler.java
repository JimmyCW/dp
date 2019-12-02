package com.wx.chainofresp;

public class ConcreteHandler extends Handler {

    public ConcreteHandler(String type) {
        super(type);
    }

    @Override
    public void handleReq(String type) {
        if (this.type.equals(type)) {
            System.out.println("i can handle this type:" + type);
        } else {
            System.out.println("i cant handle this type:" + type + " cause I am :" + this.type + ", find next");
            if (getNext() != null) {
                getNext().handleReq(type);
            } else {
                System.out.println("i cant handle this type:" + type + " no next");
            }
        }
    }

    public static void main(String[] args) {
        Handler handler = new ConcreteHandler("a");
        handler.setNext(new ConcreteHandler("b"));
        handler.setNext(new ConcreteHandler("c"));
        handler.setNext(new ConcreteHandler("d"));
        handler.setNext(new ConcreteHandler("e"));
        handler.handleReq("f");

    }
}
