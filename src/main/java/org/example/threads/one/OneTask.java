package org.example.threads.one;

import java.util.stream.IntStream;

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

        IntStream.range(0, 1000)
                .parallel() // This is your "#pragma omp parallel"
                .forEach(i -> counter.increment());
        System.out.println("Итог: " + counter.getCount() + '\n'); // Всегда 2000

    }

}
