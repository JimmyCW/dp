package com.wx.facade;

public class CPU implements Part{

    @Override
    public void start() {
        System.out.println("cpu start");
    }

    public static void main(String[] args) {
        int a=0,c=0;
        do{--c;a=a-1;}while(a>0);
        System.out.println(c);
    }
}
