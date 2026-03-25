// Book Schildt

package org.example.book;

import org.example.classes.oop.A;
import org.example.classes.oop.B;
import org.example.classes.oop.RelizeOOP;
import org.example.threads.one.OneTask;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.annotation.*;

import func.SimpleFunc;

public class Book {
    public static void book1() {
        // Глава 2
        System.out.println("Глава 2:");

        int n = 1;
        boolean nn = true;
        if (n == 1) System.out.println("\nTrue");
        if (nn) System.out.println("True\n");

        float ff = 0.95f;
        System.out.println(ff);
        // ---

        // Глава 3
        System.out.println("Глава 3:");

        double dd = 1 / 2;
        System.out.println(dd);

        int[] arr1 = new int[12];
        int[] arr2 = {0, 1, 2};
        n++;
        ++n;
        var arr3 = new double[][]{{1.0, 2.0}, {2.0, 3.0}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        int input;
        int[] arr4 = null;
        try (Scanner scanner = new Scanner(System.in)) {// Создаем объект Scanner для считывания ввода
            System.out.println("Введите число:"); // Просим пользователя ввести строку
            input = scanner.nextInt();
            if (input < 1) throw new Throwable("Less zero");
            System.out.println("Число " + input);
            arr4 = new int[input];
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
        if (arr4 != null) {
            System.out.println(arr4[0]);
        }

        byte b = 0b0111_0001;
        System.out.println(b + "\n");

        byte a1 = 5, b1 = 6;
        byte c = (byte) (a1 + b1);
        float f1 = 0.5f;
        float f = f1 * 2.0f;

        // ---
        // Глава 4
        System.out.println("Глава 4:");

        byte b5 = -5;
        for (int i = 7; i >= 0; i--) {
            int bit = b5 >> i & 1;
            System.out.print(bit + " ");
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
        int y = ++x + 1;
        System.out.println(x);
        System.out.println();
        // ---

        // Глава 6
        System.out.println("Глава 6:");

        Calculator calc = new Calculator();
        calc.sum("Sum: ", 2, 3, 5);
        calc.check(2);

        State st = new State();

        System.out.println();
        // ---
    }
    @MyAnno(get="Привет из аннотации")
    public static void book2() {
        // Глава 7,8,9
        System.out.println("Глава 7, 8, 9:");
        OneInterface onei = new OneInterface();
        onei.read("Hello ");

        RelizeOOP.realize();

        // Глава 10
        System.out.println("\nГлава 10:");
        try {
            int num = 5/0;
        } catch (ArithmeticException e)
        {
            System.out.println(e+"\n");
        }

        // Глава 12
        System.out.println("Глава 12:");

        Days dEnum = Days.FRIDAY;
        if(dEnum == Days.FRIDAY) System.out.println(dEnum);

        Character ch = Character.valueOf('v');
        Character ch2 = 'k';
        System.out.println(ch.charValue()+ " " + ch2);

        // Рефлексия
        OneTask t = new OneTask();
        try {
            Class<?> cl = t.getClass();
            Method getMethod = cl.getMethod("run");
            getMethod.invoke(null);

            Class<?> cll = OneTask.class;
            Method[] m = cll.getDeclaredMethods();

            Class<?> annot = Book.class;
            Method getAnnotMethod = annot.getMethod("book2");
            Annotation getAn = getAnnotMethod.getAnnotation(MyAnno.class);
            System.out.println(getAn);

            for (Method mm : m) {
                String name = mm.getName();
                System.out.println(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // ---
    }
    public static void book3() {
        // Глава 13
        System.out.println("Глава 13");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
        char c = 'q';
        System.out.print("Введите символы: ");
        do {
            try{
                c = (char) bf.read();
                System.out.write((int) c); // пишет байты, а не char(2 байта)
            } catch (IOException e)
            {
                System.out.println(e);
            }
        } while (c != 'q');
        System.out.flush(); // Forces the character to appear now from buffer

        try (PrintWriter out = new PrintWriter(new FileWriter("temp/output.txt"))) {
            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    out.print(j+i+1 + " ");
                }
                out.print("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        try (BufferedReader reader = new BufferedReader(new FileReader("temp/output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split by one or more spaces
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                String[] parts = line.trim().split(" ");
                for (String part : parts) {
                    if (!part.isEmpty()) {
                        tmp.add(Integer.parseInt(part));
                    }
                }
                arr.add(tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("\n");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.print("\n");
        }
        
        // Глава 14
        System.out.println("\nГлава 14");

        Template<Double> t = new Template<Double>(5.06);
        double res = t.calculate(t);
        System.out.println(res);

        // Глава 16
        System.out.println("\nГлава 16");
        System.out.println(SimpleFunc.getGreeting());
    }
    public static void book4() {
        // Глава 18
        System.out.println("Chapter 18");
        
        String st = "hello".replace("he", "we");
        StringBuffer sb = new StringBuffer(st);
        sb.deleteCharAt(1);
        String newSt = sb.toString();
        System.out.println(newSt);

        // Глава 19
        System.out.println("\nChapter 19");
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println(currentProcess.info() + "\t" + Runtime.version());
        
    }

}
