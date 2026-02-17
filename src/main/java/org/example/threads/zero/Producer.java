package org.example.threads.zero;

public class Producer implements Runnable {

    private Q q;
    public Thread t;
    public Producer(Q q)
    {
        this.q = q;
        this.t = new Thread(this, "Producer");
    }
    public void run()
    {
        int i = 0;
        while(true)
        {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }
            q.put(i++);
        }
    }

}
