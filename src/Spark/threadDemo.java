package Spark;

public class threadDemo {
    public static void main(String[] args) {
        demo d=new demo();
        Thread th=new Thread(d);
        th.start();
        for (int i = 0; i < 10; i++) {
            System.out.print("sad ");
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(th.getName());
        Thread.currentThread().setPriority(2);
        th.setPriority(2);

        th.setName("raees");
        System.out.println(th.getName());
    }
}
class demo implements Runnable
{
   public void run()
   {
       for (int i = 0; i <10 ; i++) {
           System.out.print("smile  ");

       }
   }
}
