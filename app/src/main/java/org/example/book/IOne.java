package org.example.book;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public interface IOne {
    void read(String s);
    int NO = 5;
    default String write()
    {
        return "IWrite " + priv();
    }
    @Contract(pure = true)
    private @NotNull String priv()
    {
        return "Private";
    }
}
