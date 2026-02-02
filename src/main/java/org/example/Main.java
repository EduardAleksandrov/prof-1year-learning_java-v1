package org.example;

import org.example.classes.General;
import org.example.classes.ref.RefTask;
import org.example.threads.one.OneTask;
import org.example.threads.three.ThreeTask;
import org.example.threads.two.TwoTask;
import org.example.threads.four.SumTask;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.concurrent.ForkJoinPool;
import java.util.Scanner;


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
        // Глава 2
        System.out.println("Глава 2:");

        int n = 1;
        boolean nn = true;
        if(n==1) System.out.println("\nTrue");
        if(nn) System.out.println("True\n");

        float ff = 0.95f;
        System.out.println(ff);
        // ---

        // Глава 3
        System.out.println("Глава 3:");

        double dd = 1/2;
        System.out.println(dd);

        int[] arr1 = new int[12];
        int[] arr2 = {0, 1, 2};
        n++;
        ++n;
        var arr3 = new double[][] { {1.0, 2.0},{2.0, 3.0} };
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        int input;
        int[] arr4 = null;
        try(Scanner scanner = new Scanner(System.in)) {// Создаем объект Scanner для считывания ввода
            System.out.println("Введите число:"); // Просим пользователя ввести строку
            input = scanner.nextInt();
            if(input < 1) throw new Throwable("Less zero");
            System.out.println("Число " + input);
            arr4 = new int[input];
        } catch(Throwable t) {
            System.out.println(t.getMessage());
        }
        if(arr4 != null)
        {
            System.out.println(arr4[0]);
        }

        byte b = 0b0111_0001;
        System.out.println(b+"\n");

        byte a1 = 5, b1 = 6;
        byte c = (byte) (a1+b1);
        float f1 = 0.5f;
        float f = f1 * 2.0f;

        // ---
        // Глава 4
        System.out.println("Глава 4:");

        byte b5 = -5;
        for(int i = 7; i >= 0; i--)
        {
            int bit = b5 >> i & 1;
            System.out.print(bit+" ");
        }
        System.out.println();

        boolean b6 = true, b7 = false;
        System.out.println((b6 & b7) + "\n");
        // ---

        // Глава 5
        /*
        * switch
        * while, for без тела
        * Несколько переменных в for
        * */

        // ---

        // Глава 12
        // Рефлексия
        System.out.println("Глава 12:");

        OneTask t = new OneTask();
        try {
            Class<?> cl = t.getClass();
            Method getMethod = cl.getMethod("run");
            getMethod.invoke(null);

            Class<?> cll = OneTask.class;
            Method[] m = cll.getDeclaredMethods();
            for(Method mm: m)
            {
                String name = mm.getName();
                System.out.println(name);
            }
        } catch(Exception e)
        {
            e.printStackTrace();
        }
        // ---
    }

}
