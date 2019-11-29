package com.wx.strategy;

public class Test {

    public static void main(String[] args) {
        ICalculator iCalculator = new PlusCalculator();
        System.out.println(iCalculator.operation(1, 2));

        ICalculator iCalculator1 = new MinusCalculator();
        System.out.println(iCalculator1.operation(2, 1));
    }
}
