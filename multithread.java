class ThreadA extends Thread{
    int i;
    public void run()
    {
        for(i=0; i<=10; i++)
            System.out.println("i=" +i);
    }
}
class ThreadB extends Thread{
    int j;
    public void run()
    {
        for(j=0; j<=20; j++)
            System.out.println("j+" +j);
    }
}
class mainThread
{
    public static void main(String[] args)
    {
        ThreadA objA = new ThreadA(Thread.setpriority(s));
        Thread objB = new ThreadB(Thread.getpriority(g));
        objA.start();
        objB.start();
    }
}
