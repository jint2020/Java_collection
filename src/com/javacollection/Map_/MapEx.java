package com.javacollection.Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {

        //遍历 2 种方式 
        // 并遍历显示工资>18000 的员工(遍历方式最少两种)
        
        Map empMap = new HashMap();
        Employee ep1 = new Employee(1,"Jack",5600);
        Employee ep2 = new Employee(2,"Tim",19000);
        Employee ep3 = new Employee(3,"Lucy",50600);

        empMap.put(ep1.getId(),ep1);
        empMap.put(ep2.getId(),ep2);
        empMap.put(ep3.getId(),ep3);

        Set keySet = empMap.keySet();
        for (Object o : keySet) {
            Employee tmp = (Employee) empMap.get(o);
            if (tmp.getPrice() >= 18000) {
                System.out.println(tmp.getId());
            }
        }
        
        Set entrySet = empMap.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry next = (Map.Entry) it.next();
            Employee tmp = (Employee) next.getValue();
            if (tmp.getPrice() >= 18000) {
                System.out.println(tmp.getId());
            }
        }
    }
}

class Employee{
    private int id;
    private String name;
    private double price;

    public Employee(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
