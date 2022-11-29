package com.javacollection.Exercise.Four;

public class Ex4 {
    /**
     * 简答题：HashSet和TreeSet如何实现去重
     */
    //1、通过hash() + equals() 方法
    //分析：
    //1、先传入key，计算key的hash值
    //2、通过hash值定位该值在table的位置
    //3、如果该位置没有值，直接放进去，并返回null
    //4、若果该位置有值，就开始将传入的值与该table位置中的链表的每一个值进行对比 -> 通过调用对象的equals()
    //5、若果全都不同，直接把值放到该链表最后一位
    //6、如果有一个相同，直接返回该值，并结束 -> 即该值没被放进HashSet里面


}
