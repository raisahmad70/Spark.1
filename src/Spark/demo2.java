package Spark;

public class demo2 {
    public static void main(String[] args) {
        sham sm=new sham("Mohammad","Ahmad");
        sm.disp();

    }


}
class ashu
{
    String name;
    ashu( String s)
    {
      name=s;
    }
}
class sham extends ashu
{
    String name;
    sham(String s1,String s2)
    {
        super(s1);
        this.name=s2;
    }
    void disp(){
        System.out.println("super class => "+super.name+"\nsub class =>"+this.name);
    }
}