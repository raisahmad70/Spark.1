package Spark;

public class threade {
    public static void main(String[] args) {
        impe im=new impe();
        im.start();
        for (int i=1;i<=10;i++)
            System.out.println("main "+i+12);

    }
}
class impe extends Thread
{
    @Override
    public void run() {
        for (int i=1;i<=10;i++)
            System.out.println("imp "+i+12);
    }
}

