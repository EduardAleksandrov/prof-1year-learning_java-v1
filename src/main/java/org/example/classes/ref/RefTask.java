package org.example.classes.ref;

import org.jetbrains.annotations.NotNull;

public class RefTask {
    public static void run()
    {
        // Ref Generic
        int r = 5;
        RefGeneric<Integer> reg = new RefGeneric<Integer>(r);
        ref(reg);
        r = reg.value;
        System.out.print("Ref ссылка в функцию: ");
        IO.println(r);
    }
    static void ref(@NotNull RefGeneric<Integer> r)
    {
        r.value = 6;
    }

}
