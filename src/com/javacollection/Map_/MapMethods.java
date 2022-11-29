package com.javacollection.Map_;

import java.util.*;

public class MapMethods {
    public static void main(String[] args) {
        Map mp = new HashMap();

        mp.put("no2", "张无忌");//k-v
        mp.put("no1", "张三丰");//当有相同的 k , 就等价于替换.
        mp.put("no3", "张三丰");//k-v
        mp.put(null, null); //k-v
        mp.put(null, "abc"); //等价替换
        mp.put("no4", null); //k-v
        mp.put("no5", null); //k-v
        mp.put(1, "赵敏");//k-v



    }
}
