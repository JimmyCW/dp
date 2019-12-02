package com.wx.template;

public abstract class Account {

    abstract String calculateAccountType();

    abstract double calculateInterestRate();

    private double calculateAmount(String accountType){
        if(accountType.equals("a")) {
            return 722.00;
        } else if (accountType.equals("b")) {
            return 723.00;
        } else {
            return 724.00;
        }
    }

    final double calculateInterest() {
        double v = calculateInterestRate();
        String s = calculateAccountType();
        return v * calculateAmount(s);
    }
}
