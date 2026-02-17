package org.example.threads.zero;

public class Q {
    int n;
    boolean ValueSet = false;
    synchronized int get()
    {
        while(!ValueSet) // condition variable
        {
            try{
                wait();
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
        System.out.println("Получено: " + n);
        ValueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n)
    {
        while(ValueSet)
        {
            try{
                wait();
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
        this.n = n;
        ValueSet = true;
        System.out.println("Отправлено: " + n);
        notify();
    }
}
