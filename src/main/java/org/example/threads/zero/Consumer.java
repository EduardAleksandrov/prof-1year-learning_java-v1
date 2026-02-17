package org.example.threads.zero;

public class Consumer implements Runnable {

    private Q q;
    public Thread t;
    public Consumer(Q q)
    {
        this.q = q;
        this.t = new Thread(this, "Consumer");
    }
    public void run()
    {  
        while(true)
        {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }
            q.get();
        }
    }

}
