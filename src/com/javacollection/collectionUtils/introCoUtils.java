package com.javacollection.collectionUtils;


import java.util.*;

public class introCoUtils {
    public static void main(String[] args) {
        //Collections工具类封装了很多静态方法，只要调用即可。

        List lst = new ArrayList();
        lst.add("lucia");
        lst.add("lay");
        lst.add("kong");
        lst.add("mi");
        System.out.println("original list -> "+lst);
/*
        Collections.sort(lst);
        System.out.println("after sorted -> "+lst);*/
        
        Collections.sort(lst, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });

        System.out.println("after sorted -> "+lst);



        int[] ary = {2,5,4};
        List list = Arrays.asList(ary);

        Collections.sort(list);



    }
}
