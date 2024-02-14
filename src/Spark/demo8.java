package Spark;
public class demo8
{
    public static void main(String[] args) {
        parant pr =new childe();
        ((childe) pr).systems();
//        pr.sho();
    }

}
abstract class shanu
{
   abstract void systems();
}
interface parant
{
    void sho();

}class childe extends shanu implements parant
{
    public void sho()
    {
        System.out.println("it,s child class");
    }

    @Override
    void systems() {
        System.out.println("hello everyone");
    }
}
