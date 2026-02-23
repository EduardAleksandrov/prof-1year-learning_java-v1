package org.example.book;

public class Template<T extends Number> {
    public T t;
    public Template(T x)
    {
        this.t = x;
    }
    public T calculate(Template<? extends T> one)
    {
        return one.t;
    }
}
