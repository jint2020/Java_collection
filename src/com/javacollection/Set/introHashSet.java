package com.javacollection.Set;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;

public class introHashSet {
    public static void main(String[] args) {
        //H
        HashSet st = new HashSet();

        st.add(new Employee("jack", 25,new MyDate(LocalDate.of(1999,11,7))));
        st.add(new Employee("lucy", 20,new MyDate(LocalDate.of(2005,11,7))));
        st.add(new Employee("jack", 25,new MyDate(LocalDate.of(1999,11,7))));

        for (Object obj :
                st) {
            System.out.println(obj);
        }

    }
}

class Employee {

    private MyDate birthday;
    private String name;
    private int age;

    public Employee( String name, int age,MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name)&&birthday.equals(employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthday,name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "birthday=" + birthday +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class MyDate {
    private LocalDate birthday;

    public MyDate(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate)) return false;
        MyDate myDate = (MyDate) o;
        return Objects.equals(birthday, myDate.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthday);
    }

    @Override
    public String toString() {
        return ""+birthday;
    }
}
