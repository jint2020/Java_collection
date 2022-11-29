package com.javacollection.ArrayList;


import java.util.ArrayList;
import java.util.List;

public class ArrayList_ {
    public static void main(String[] args) {
        ArrayList lst = new ArrayList();
        lst.add("233");
        lst.add("666");
        lst.add(10);
        ArrayList tmpLst = new ArrayList();
        tmpLst.add("dayuren");
        tmpLst.add(26);

        lst.addAll(tmpLst);
        lst.remove("233");
        lst.size();
        lst.clear();
        System.out.println(lst.getClass().getSimpleName());


        List list = new ArrayList();
        System.out.println(list.getClass().getSimpleName());


    }
}
