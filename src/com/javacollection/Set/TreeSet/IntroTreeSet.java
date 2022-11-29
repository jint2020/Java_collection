package com.javacollection.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

/**
 * 1.使用无参构造器创建Treeset是无序的
 */

public class IntroTreeSet {
    public static void main(String[] args) {
        TreeSet tSet = new TreeSet();
        tSet.add("lucia");
        tSet.add("mic");
        tSet.add("12");
        tSet.add("12");

        System.out.println("使用无参构造器创建Treeset是无序的 -> "+tSet);
    }
}
