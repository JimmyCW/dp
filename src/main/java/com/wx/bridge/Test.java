package com.wx.bridge;

public class Test {

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        Sourceable source1 = new Source1();
        bridge.setSourceable(source1);
        bridge.method();
        Sourceable source2 = new Source2();
        bridge.setSourceable(source2);
        bridge.method();
    }

}
