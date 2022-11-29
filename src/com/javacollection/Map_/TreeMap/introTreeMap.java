package com.javacollection.Map_.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class introTreeMap {
    public static void main(String[] args) {

        //使用默认构造器创建的TreeMap是无序的
        //TreeMap tMap = new TreeMap();
        TreeMap tMap = new TreeMap<>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo((String) o1);
            }
        });

        tMap.put("jack", "捷克");
        tMap.put("lucia", "露西娅");
        tMap.put("Amy", "艾米丽");
        tMap.put("A", "艾米丽");
        System.out.println(tMap);
    }
}
