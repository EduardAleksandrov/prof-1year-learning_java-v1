package org.example.threads.two;

import java.util.concurrent.CompletableFuture;

public class TwoTask {
    public static void call()
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


        CompletableFuture.supplyAsync(() -> "Данные из сети")
                .thenApply(data -> data + " обработаны")
                .thenAccept(System.out::println);
        System.out.println("CompletableFuture thread finished.");
    }
}
