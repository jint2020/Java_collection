package com.javacollection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

public class introLinkedHashSet {
    //
    //@SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add("hsp");
        lhs.add("hello");
        lhs.add(345);
        lhs.add(123);
        lhs.add("hsp");

        Iterator it = lhs.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


        /**

         * Car 类(属性:name,price)，
         * 如果 name 和 price 一样，
         * * 则认为是相同元素，就不能添加。 */

        LinkedHashSet carlhst = new LinkedHashSet();

        carlhst.add(new Car("auto",5000));
        carlhst.add(new Car("audi",200000));
        carlhst.add(new Car("benz",500000));
        carlhst.add(new Car("auto",5000));

        it = carlhst.iterator();

        while(it.hasNext()){
            Car obj = (Car) it.next();
            System.out.println(obj);

        }
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
