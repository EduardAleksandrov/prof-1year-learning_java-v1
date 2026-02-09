package org.example;

import org.example.classes.General;
import org.example.classes.ref.RefTask;
import org.example.start.Start1;
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
//        thread1();
//        thread2();
//        thread3();
//        thread4();
// 2 Calculate general
//        start();
//        RefTask.run();
// 3 Book Schildt
        book();
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
    static void start()
    {
        Start1.function1();
    }
// 3
    // Book Schildt
    static void book()
    {
//        Book.book1();
        Book.book2();
    }

}
