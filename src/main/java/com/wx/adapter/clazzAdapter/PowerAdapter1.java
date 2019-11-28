package com.wx.adapter.clazzAdapter;

/**
 * 对象适配器
 */
public class PowerAdapter1 implements AC5 {

    private AC220 ac220;

    public PowerAdapter1(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputAC5() {
        return ac220.outputAC220()/5;
    }
}
