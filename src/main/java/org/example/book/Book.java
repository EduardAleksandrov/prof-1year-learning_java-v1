// Book Schildt
package org.example.book;

import org.example.threads.one.OneTask;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Book {
    public static void book1()
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
        System.out.println("Глава 5:");
        int x = 1;
        int y = ++x+1;
        System.out.println(x);
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
