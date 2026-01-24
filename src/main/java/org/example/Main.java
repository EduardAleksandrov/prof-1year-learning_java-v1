package org.example;

import org.example.classes.General;

import org.example.classes.RefGeneric;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import java.math.BigDecimal;
import java.util.concurrent.CompletableFuture;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main()
    {
// 1 Println
        pr();
// 2 JSON
        JSON();
// 3 Threads
        thread1();
// 4 Calculate
        function1();
    }
// 1
    static void pr()
    {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
        }
    }
// 2
     static void JSON()
    {
        JSONObject jo = new JSONObject("{ \"abc\" : \"def\" }");
        System.out.println(jo);
    }
// 3.1
    static void thread1()
    {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            // Simulated long-running task
            try {
                Thread.sleep(5000);
                System.out.println("Task completed!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Wait");
        // Wait for the task to complete (optional)
        future.join();
        System.out.println("Main thread finished.");
    }
// 4
    static void function1()
    {
        Integer @NotNull [] xx = {5};
        calculate(xx);
        IO.println(xx[0]);

        General gn = new General("Hello");
        IO.println(gn.str);

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

        int n = 1;
        boolean nn = true;
        if(n==1) System.out.println("True");
        if(nn) System.out.println("True");

        IO.println(sum(5));

        // Ref Generic
        int r = 5;
        RefGeneric<Integer> reg = new RefGeneric<Integer>(r);
        ref(reg);
        r = reg.value;
        System.out.print("Ref ссылка в функцию: ");
        IO.println(r);
    }
    static void calculate(Integer @NotNull [] xx)
    {
        xx[0] = 6;
    }

    /**
     * @param r - primitive by reference
     */
    static void ref(@NotNull RefGeneric<Integer> r)
    {
        r.value = 6;
    }

    /**
     * @param n - value for function
     * @return - total sum
     */
    static int sum(int n)
    {
        int total = 0;
        for(int i = 0; i < n; i++)
        {
            total +=i;
        }
        return total;
    }
}
