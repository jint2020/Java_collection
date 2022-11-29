package com.javacollection.ArrayList;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class aryListEx {


    public static void main(String[] args) {
        List<Book> col = new ArrayList<>();
        col.add(new Book("红楼梦", 100));
        col.add(new Book("三国演义", 150));
        col.add(new Book("西游记", 80));
        col.add(new Book("水浒传", 130));
        col.add(new Book("特朗普自传", 10));
        col.add(new Book("武林秘籍", 10));

        Iterator<Book> it = col.iterator();


        System.out.println("排序前的顺序如下："+col);

        Book tmp = null;
        for (int i = 0; i < col.size()-1; i++) {
            for (int j = i+1; j < col.size(); j++) {
                if (col.get(i).getPrice() > col.get(j).getPrice() ) {
                    tmp = col.get(i);
                    col.set(i,col.get(j));
                    col.set(j,tmp);
                }
            }
        }
        System.out.println("排序后的顺序如下：");
        for (Book bk:col) {
            System.out.println(bk);
        }
    }
}


class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}



