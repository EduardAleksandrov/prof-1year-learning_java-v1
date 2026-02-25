package org.example.book;

public class OneInterface implements IOne{
    @Override
    public void read(String s) {
        System.out.println(s + write() + " " + NO);
    }
}
