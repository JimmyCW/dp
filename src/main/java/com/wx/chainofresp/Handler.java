package com.wx.chainofresp;

public abstract class Handler {

    private Handler next;

    protected String type;

    public Handler(String type) {
        this.type = type;
    }

    public abstract void handleReq(String type);

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        if(this.next != null) {
            Handler tmp = this.next;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = next;
        } else {
            this.next = next;
        }
    }
}
