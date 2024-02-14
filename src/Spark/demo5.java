package Spark;

public class demo5 {
    public static void main(String[] args) {
        car cr=new car();
        tractor tr=new tractor();
        bick bk=new bick();
        bus bs=new bus();
        System.out.println("speed of car "+cr.speed()+"km/h");
        System.out.println("speed of Tractor "+tr.speed()+"km/h");
        System.out.println("speed of Bike "+bk.speed()+"km/h");
        System.out.println("speed of bus "+bs.speed()+"km/h");
    }

}
abstract class speed
{
    public abstract int speed();
}
class car extends speed
{

    @Override
    public int speed() {
        return 250;
    }
}
class bick extends speed
{

    @Override
    public int speed() {
        return 300;
    }
}class tractor extends speed
{

    @Override
    public int speed() {
        return 50;
    }
}class bus extends speed
{

    @Override
    public int speed() {
        return 150;
    }
}
