package org.example.threads.four;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer> {
    private final int[] numbers;
    private final int start;
    private final int end;

    public SumTask(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 10) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += numbers[i];
            }
            return sum;
        } else {
            int mid = (start + end) / 2;
            SumTask task1 = new SumTask(numbers, start, mid);
            SumTask task2 = new SumTask(numbers, mid, end);
            invokeAll(task1, task2);
            return task1.join() + task2.join();
        }
    }
}
