package com.javacollection.Exercise.Two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        Car c1 = new Car("bmw",400000);
        Car c2 = new Car("bind",5000000);

        ArrayList<Car> lst = new ArrayList<>();

        //把c1对象添加到lst列表里
        lst.add(c1);
        System.out.println("把c1对象添加到lst列表里");
        System.out.println(lst);
        //把对象c1移除
        lst.remove(c1);
        System.out.println("把对象c1移除");
        System.out.println(lst);

        //判断lst是否包含c2对象
        System.out.println(lst.contains(c2));

        //打印lst的长度
        System.out.println(lst.size());
        //判断lst是否为空
        System.out.println(lst.isEmpty());

        lst.clear();
        System.out.println(lst);
        List tmp = Arrays.asList(c1,c2);
        lst.addAll(tmp);
        System.out.println(lst);
        lst.containsAll(tmp);
        System.out.println(tmp);
        lst.removeAll(tmp);
        System.out.println(lst);



    }
}

class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}