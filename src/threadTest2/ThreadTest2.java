package threadTest2;

class MyRun implements Runnable
{
    public void run(){}
}


public class ThreadTest2
{
    public static void main(String[] args)throws Exception
    {
        Thread t = new Thread(new MyRun(),"My Name");
    }
}