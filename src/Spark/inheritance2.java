package Spark;
//multilevel inheritance
public class inheritance2 {
    public static void main(String[] args) {
        b b=new b();
        b.display();
    }

}
class a
{
    String name;
}
class b extends a
{
    String name;
  void   display()
    {
        super.name="Raees";
        name="Ahmad";
        System.out.println("parent String "+super.name+" child String "+this.name);

    }

}
