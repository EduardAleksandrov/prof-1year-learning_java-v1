package org.example.book;

public interface IOne {
    void read(String s);
    int NO = 5;
    default String write()
    {
        return "IWrite " + priv();
    }
    private String priv()
    {
        return "Private";
    }
}
