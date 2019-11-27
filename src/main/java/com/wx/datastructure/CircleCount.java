package com.wx.datastructure;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CircleCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int n = input.nextInt();
        long mill = System.currentTimeMillis();
        final int flag = 3;
        List<Integer> mans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            mans.add(i + 1);
        }
        Iterator<Integer> iter = null;
        int k = 1;
        do {
            iter = mans.iterator();
            while (iter.hasNext()) {
                iter.next();
                if (k++ % flag == 0) {
                    iter.remove();
                    k = 1;
                }
            }
        } while (mans.size() > 1);
        long m2= System.currentTimeMillis();
        System.out.println(mans.get(0));
        System.out.println(m2 - mill);
    }
}
