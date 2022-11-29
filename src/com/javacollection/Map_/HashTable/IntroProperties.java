package com.javacollection.Map_.HashTable;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;


/**
 * 1. Properties 继承 Hashtable
 * 2. 可以通过 k-v 存放数据，当然 key 和 value 不能为null
 * */
public class IntroProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();

        //新增k-v
        //properties.put(null, "abc");//抛出 空指针异常
        // properties.put("abc", null); //抛出 空指针异常
        properties.put("john", 100);//k-v
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);//如果有相同的 key ， value 被替换

/*        Set entrySet = properties.entrySet();

        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);
        }*/

        //与Hashtable的不同指出
        //查询可以用get()
        //删除可以用remove()
        //Properties还提供了一个getProperties(),以查找数据

    }
}
