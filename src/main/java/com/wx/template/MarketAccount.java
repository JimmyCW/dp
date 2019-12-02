package com.wx.template;

public class MarketAccount extends Account {
    @Override
    String calculateAccountType() {
        return "a";
    }

    @Override
    double calculateInterestRate() {
        return 0.35;
    }

    public static void main(String[] args) {
        Account account = new MarketAccount();
        double v = account.calculateInterest();
        System.out.println(v);
    }


}
