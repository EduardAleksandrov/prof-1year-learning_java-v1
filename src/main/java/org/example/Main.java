package org.example;

import org.example.classes.General;

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
    }
    static void calculate(Integer @NotNull [] xx)
    {
        xx[0] = 6;

    }
}
