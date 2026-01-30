package org.example.threads.three;

import java.util.concurrent.Executors;
import java.time.Duration;

/**
 *  Project Loom - Виртуальные потоки
 */
public class ThreeTask {
    public static void projectLoom()
    {
        // Создаем экзекутор, который плодит виртуальные потоки как семечки
        try(var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 100_000; i++) {
                int taskId = i;
                executor.submit(() -> {
                    // Имитируем тяжелую работу (например, запрос в БД)
                    Thread.sleep(Duration.ofSeconds(1));
                    if(taskId % 10_000 == 0) System.out.println("Задача " + taskId + " выполнена потоком: " + Thread.currentThread());
                    return taskId;
                });
            }
            System.out.println("Кто вперед?");
        } // Здесь executor.close() дождется завершения всех 100к задач
    }


}
