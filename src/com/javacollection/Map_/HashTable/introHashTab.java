package com.javacollection.Map_.HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class introHashTab {
    // hashtable跟hashMap的用法基本基本一致
    // HashTable继承Dictionary接口
    // key和value都不允许null，否则报错
    // 但Hashtable是线程安全的（方法有synchronized）：例如
        /**
         public synchronized Enumeration<V> elements() {
            return this.<V>getEnumeration(VALUES);
        }
        * */
    public static void main(String[] args) {
        //初始空间为11，THRESHOLD为8
        //当table数组空间>=8的时候，数组扩容（调用rehash()方法进行扩容）
        //扩容机制如下 扩容后的长度 = (旧的数组空间长度 * 2) + 1
        //例如，第一次扩容就是 （11*2）+1  = 23
        Hashtable table = new Hashtable();

        //Exception in thread "main" java.lang.NullPointerException
        //table.put(null,"会报错");

        //value为null，不能通过编译
        //table.put("会报错"，null);
        table.put(0,"Jason");
        table.put(1, "Jack");//k-v

        Set entrySet = table.entrySet();

        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);

        }


    }
}
