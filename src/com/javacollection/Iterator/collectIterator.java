package com.javacollection.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectIterator {
    public static void main(String[] args) {
        Collection<Book> col =  new ArrayList<>();
        col.add(new Book("红楼梦",100));
        col.add(new Book("三国演义",150));
        col.add(new Book("西游记",80));
        col.add(new Book("水浒传",130));

        Iterator<Book> it = col.iterator();

        while(it.hasNext()){
            Book obj = it.next();
            System.out.println(obj.toString());
        }
        //iterator遍历完成后，不能再写hasNext()了，否则会报NoSuchElement错误
        //需要重置遍历器 => it.it = col.iterator();

    }

}


class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

