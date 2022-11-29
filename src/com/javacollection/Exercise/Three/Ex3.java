package com.javacollection.Exercise.Three;

import java.util.*;

public class Ex3 {

    public static void main(String[] args) {
        HashMap<String,Integer> m = new HashMap<>();
        m.put("jack",650);
        m.put("tom",1100);
        m.put("smith",2900);

        m.put("jack",2600);

        //使用keySet()进行遍历
        Collection keys = m.keySet();

        Iterator it = keys.iterator();
        while (it.hasNext()) {
            String next = (String) it.next();
            m.put(next,(Integer)m.get(next)+100);
        }

        System.out.println(m);

//        Set enSet = m.entrySet();
//        it = enSet.iterator();
//        while (it.hasNext()) {
//            Map.Entry node =  (Map.Entry) it.next();
//            System.out.println(node.getKey());
//            System.out.println(node.getValue());
//        }


    }
}


