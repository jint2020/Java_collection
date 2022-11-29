package com.javacollection.Map_;

import java.util.*;

public class LoopMap {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("no1", "韩顺平");//k-v
        map.put("no2", "张无忌");//k-v
        map.put("no1", "张三丰");//当有相同的 k , 就等价于替换.
        map.put("no3", "张三丰");//k-v

        //第一种方法：keySet() -> 遍历map里面的keys
        //通过map内部方法get方法获取对应的value
        Set keyset = map.keySet();

        for (Object o : keyset) {
            System.out.println(o);
            System.out.println(map.get(o));
        }

        //第二种方法：values() -> 遍历map里面的values
        //
        Collection values =  map.values();
        for (Object value : values) {
            System.out.println(value);
        }

        //第三种方法：keySet() -> 相当于遍历HashMap@Node
        Set enterySet = map.entrySet();
        Iterator it = enterySet.iterator();

        while (it.hasNext()) {
            Map.Entry next = (Map.Entry) it.next();
            System.out.println(next.getKey() + " = "+next.getValue());
        }


    }
}
