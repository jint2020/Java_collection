package com.javacollection.LinkedList;

import java.util.*;


/**
 * 介绍LinkedList的 CRUD 方法
 * */
public class introLinkedList {
    public static int removeDuplicates(int[] nums) {
        // int n = nums.length;
        // int j = 0;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] != nums[j]) {
        //         j+=1;
        //         nums[j] = nums[i];
        //     }
        // }
        // return j+1;

        Set<Integer> numsSet= new HashSet();
        for(int i : nums){
            numsSet.add(nums[i]);

        }
        int i = 0;
        nums = new int[numsSet.size()];
        for (Integer obj:numsSet) {
            nums[i] = obj;
            i++;
        }
        System.out.println(nums.length);
        return numsSet.size();

    }
    public static void main(String[] args) {
        //通过LinkedList的无参构造器创建一个新空列表
        Collection linkLst = new LinkedList();

        linkLst.add("helloWorld");
        linkLst.add("hello");
        linkLst.add("world");
        linkLst.add("Baby");
        System.out.println(linkLst);

        ArrayList lst =new ArrayList();
        lst.add("233");
        lst.add("233");
        lst.add("666");
        lst.add("666");
        linkLst.addAll(lst);
        System.out.println(linkLst);


        System.out.println("===linkedlist转换we为hashset===");
        Set lstToSet = new HashSet(linkLst);

        System.out.println(lstToSet);

        int[] ary = {1,1,2};
        removeDuplicates(ary);

    }
}


