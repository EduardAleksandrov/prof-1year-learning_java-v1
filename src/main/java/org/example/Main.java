package org.example;

import org.example.classes.General;
import org.example.classes.ref.RefTask;
import org.example.threads.one.OneTask;
import org.example.threads.three.ThreeTask;
import org.example.threads.two.TwoTask;
import org.example.threads.four.SumTask;
import org.example.book.Book;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.concurrent.ForkJoinPool;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main()
    {
// 1 Threads
        thread1();
        thread2();
        thread3();
        thread4();
// 2 Calculate general
        function1();
        RefTask.run();
// 3 Book Schildt
        book1();
    }

// 1
    static void thread1()
    {
        OneTask.run();
    }

    static void thread2()
    {
        TwoTask.call();
    }

    static void thread3()
    {
        ThreeTask.projectLoom();
    }

    static void thread4()
    {
        try(ForkJoinPool pool = new ForkJoinPool())
        {
            int[] numbers = new int[100];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i + 1;
            }

            int result = pool.invoke(new SumTask(numbers, 0, numbers.length));
            System.out.println("\nСумма: " + result + '\n');
        } catch(Exception e) { e.printStackTrace(); }
    }
// 2
    static void function1()
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
// 3
    // Book Schildt
    static void book1()
    {
        Book.book1();
    }

}
