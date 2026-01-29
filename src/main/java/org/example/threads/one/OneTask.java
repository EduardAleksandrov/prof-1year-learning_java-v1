package org.example.threads.one;

import org.example.threads.one.OneCounter;

public class OneTask {

    public static void run()
    {
        OneCounter counter = new OneCounter();

        // Создаем два потока, которые одновременно дергают счетчик
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Поток был прерван!");
            Thread.currentThread().interrupt(); // Хорошая практика — восстановить статус прерывания
        }

        System.out.println("Итог: " + counter.getCount()); // Всегда 2000

    }

}
