package com.wx.datastructure;

import java.util.*;

public class BadCode {

    private static Map<String, String> map = new LinkedHashMap<>();

    static {
        map.put("102800","河北分公司");
        map.put("101400","河南分公司");
        map.put("100900","黑龙江分公司");
        map.put("101500","吉林分公司");
        map.put("102400","辽宁分公司");
        map.put("102900","内蒙古分公司");
        map.put("103900","宁夏分公司");
        map.put("102600","青岛分公司");
        map.put("103800","青海分公司");
        map.put("100100","山东分公司");
        map.put("101700","山西分公司");
        map.put("101100","陕西分公司");
        map.put("101000","天津分公司");
        map.put("103700","西藏分公司");
        map.put("101200","新疆分公司");
    }

    public static void main(String[] args){
        //使用Scanner从样例输入（标准输入流）中获取输入数据，示例如下：
        ////（包括但不限于下列情况）
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<String>(15);
        //int x = in.nextInt(); ---取整数
        int i = 0;
        while(i < 7) {
            String s = in.nextLine();
            String[] s1 = s.split(" ");
            for(String s2 : s1) {
                if(!list.contains(s2)) {
                    list.add(s2);
                }
            }
            i++;
        }
        String result = "";
        for(String str : map.keySet()) {
            if(!list.contains(str)) {
                result = result + map.get(str) + " ";
            }
        }
        if(result.equals("")) {
            result = "无";
        }
        System.out.println(result);
    }

}