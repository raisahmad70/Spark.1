package Spark;

class parnt
{
    void display()
    {
        System.out.println("it,s parent");
    }
}
class chld extends parnt
{
    void display()
    {
        System.out.println("it,s child");
    }
}
public class demo3 {
    public static void main(String[] args) {
        parnt pr =new parnt();
        pr.display();
        pr=(parnt) new chld();
        pr.display();
        chld ch=(chld)pr;
        pr.display();


    }
}
