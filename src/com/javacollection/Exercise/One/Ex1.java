package com.javacollection.Exercise.One;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList lst = new ArrayList();
        lst.add(new News("某国家在新冠肺炎流行病期间死了很多人，并埋葬在荒郊野岭外或者公园外。"));
        lst.add(new News("这可能是个真是新闻。"));

        int n = lst.size();
        for (int i = n-1; i >= 0; i--) {
            String title = lst.get(i).toString();
            if ((title.length() >= 15)) {
                System.out.println(title.subSequence(0,14)+"...");
            }else {
                System.out.println(title);
            }
        }
    }
}

class News{
    private String title;
    private String field;

    public News(String title) {
        this.title = title;
    }

    public News(String title, String field) {
        this.title = title;
        this.field = field;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return title;
    }
}
