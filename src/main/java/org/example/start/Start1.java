package org.example.start;

import org.example.classes.General;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class Start1 {
    public static void function1()
    {
        Integer @NotNull [] xx = {5};
        calculate(xx);
        IO.println(xx[0]);

        General gn = new General("Hello");
        IO.println(gn.str);
        General.pr();
        General.JSON();

        BigDecimal decimal = new BigDecimal("123.22");

        String s = "hi";
        s = "try";
        IO.println(s);

        // Объявление и инициализация двумерного массива
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Вывод значений массива на экран
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Переход на новую строку
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println(); // Переход на новую строку
        }
    }
    /**
     * @param xx - массив
     */
    static void calculate(Integer @NotNull [] xx)
    {
        xx[0] = 6;
    }
}
