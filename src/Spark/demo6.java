package Spark;

public class demo6 {
    public static void main(String[] args) {
        multiaddition mt=new multiaddition();
        mt.multiaddition(12,12);
        mt.multiaddition(12,12,12);
        mt.multiaddition(12,12,12,12);
        mt.multiaddition(12,12,12,12,12);
        mt.multiaddition(12,12,12,12,12,12,12);

    }

}
class multiaddition
{


    void multiaddition(int...a)
    {
        int c=0;
        for (int i=0;i<a.length;i++)
        {
            c=c+a[i];

        }
        System.out.println("addition ="+c);
    }
}
