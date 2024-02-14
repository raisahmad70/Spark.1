package Spark;

public class constrtr {
    constrtr()
    {
        System.out.println("it,s parents class");
    }
}

class sana extends constrtr
{

    sana()
    {
        super();
        System.out.println("it,s lali");

    }
    sana(int a)
    {
        System.out.println("hello mather fucker");
    }


    public static void main(String[] args) {
        sana sn=new sana();
    }
}
