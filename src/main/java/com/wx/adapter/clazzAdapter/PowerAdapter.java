package com.wx.adapter.clazzAdapter;

/**
 * 类的适配器
 */
public class PowerAdapter extends AC220Impl implements AC5 {

    @Override
    public int outputAC5() {
        return outputAC220()/20;
    }
}
