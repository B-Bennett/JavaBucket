/**
 * Created by BennettIronYard on 2016.
 */

class MoreThread extends Thread{

    public long count;

    MoreThread(int priority)
    {
        setPriority(priority);
        start();
    }

    public void run()
    {
        for(;;)
        {
            count++;
        }
    }
}

public class ThreadMore {

    public static void main(String[] args) {

        MoreThread th1 = new MoreThread(Thread.MIN_PRIORITY);
        MoreThread th2 = new MoreThread(Thread.NORM_PRIORITY);
        MoreThread th3 = new MoreThread(Thread.MAX_PRIORITY);
        try{
            Thread.sleep(3000);
        }catch(InterruptedException ie)
        {
            System.out.println("Main Thread Interrupted");
        }
        th1.stop();
        th2.stop();
        th3.stop();
        System.out.println("Thread th1.count = "+th1.count);
        System.out.println("Thread th2.count = "+th2.count);
        System.out.println("Thread th3.count = "+th3.count);
    }
}
/*
The priority parameter always takes a value between 0 and 10.
One of the three static constants in the Thread class, namely the MAX_PRIORITY, MIN_PRIORITY and NORM_PRIORITY,
is used to set the priority of a thread.
 */