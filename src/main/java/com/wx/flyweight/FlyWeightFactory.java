package com.wx.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    private static Map<String, FlyWeight> map = new HashMap<>();

    public static FlyWeight getFlyWeight(String key) {
        if(key == null) {
            return null;
        }
        if(map.containsKey(key)) {
            return map.get(key);
        } else {
            FlyWeight flyWeight = new FlyWeightImpl(key);
            map.put(key, flyWeight);
            return flyWeight;
        }
    }


    public static void main(String[] args) {
        FlyWeight flyWeight = FlyWeightFactory.getFlyWeight("a");
        flyWeight.operate();
        FlyWeight flyWeight1 = FlyWeightFactory.getFlyWeight("a");
        System.out.println(flyWeight == flyWeight1);
    }
}
