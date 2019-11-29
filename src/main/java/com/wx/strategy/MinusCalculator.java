package com.wx.strategy;

public class MinusCalculator implements ICalculator {

    @Override
    public int operation(int a, int b) {
        return a - b;
    }
}
