package Spark;

public class demo4 extends dud {
    public static void main(String[] args) {
        dud dd= new demo4();
        dd.disp();
        System.out.println(dd.a);

    }

    @Override
    void disp() {
        System.out.println("hello i am Rais");
    }
}
abstract class dud
{
    int a;
    abstract void disp();
}


