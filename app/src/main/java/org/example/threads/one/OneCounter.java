package org.example.threads.one;

public class OneCounter {

    private int count = 0;

    // Синхронизация по монитору текущего объекта (this)
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
