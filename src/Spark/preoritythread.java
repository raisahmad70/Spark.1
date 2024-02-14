package Spark;
class anail
{
    String name;
    void abhi()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println("mai hu top class");

    }

}
class sunil extends anail
{
    String name;

    @Override
    void abhi() {
        super.name="suprime";
        try
        {

            this.abhi();
        }catch (StackOverflowError s)
        {
            s.getMessage();
        }
        this.name="mortal";
    }
    void  dis()
    {
        Thread.currentThread().setName("bottom");
        System.out.println(Thread.currentThread().getName());
        System.out.println("mai hu super => "+super.name+"\n mai hu sub => "+this.name);

    }
    
}
public class preoritythread {
    public static void main(String[] args) {
        sunil sn = new sunil();
        sn.abhi();
        sn.dis();
        System.out.println(Thread.currentThread().getName());
    }
}