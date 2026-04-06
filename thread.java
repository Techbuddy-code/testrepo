class A_Thread extends Thread{
    int i;
    public void run()
    {
        System.out.println("class A");
        for(i=1; i<=10; i++)
            System.out.println("i = "+i);
    }
}
class B_Thread extends Thread{
    int j;
    public void run()
    {
        System.out.println("class B");
        for(j=10; j<=50; j++)
            System.out.println("j="+j);
    }
}
class mainThread{
public static void main(String[] args){
    A_Thread obj= new A_Thread();
    B_Thread obj2= new B_Thread();
    obj.start();
    obj2.start();
}
}
