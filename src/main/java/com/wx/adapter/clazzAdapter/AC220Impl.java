package com.wx.adapter.clazzAdapter;

public class AC220Impl implements AC220 {
    @Override
    public int outputAC220() {
        System.out.println("220V");
        return 220;
    }
}
