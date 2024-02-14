package Spark;

public class threade1 {
    public static void main(String[] args) {
        impe1 imp =new impe1();
        Thread th=new Thread(imp);
        th.start();
        for (int i=1;i<=10;i++)
            System.out.println("the "+i+12);

    }
}
class impe1 implements Runnable
{
    @Override
    public void run() {
        for (int i=1;i<=10;i++)
            System.out.println("imp "+i+12);
    }
}
