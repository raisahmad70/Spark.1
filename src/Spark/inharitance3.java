package Spark;
// hierarchical inheritance

import java.util.Scanner;

public class inharitance3 {
    public static void main(String[] args) {
        StringToIntAddition mp=new StringToIntAddition();
        StringAddition ss=new StringAddition();

         int d=  mp.StToIn(mp.input());
          mp.add(d,d);
        ss.concat(mp.input(),mp.input());

    }

}
class take
{
    String input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter String ");
        String c= String.valueOf(sc.next());
        return c;

    }
}
class StringToIntAddition extends take
{
    int StToIn(String s)
    {
        int a=Integer.parseInt(s);
        return a;
    }
    void add(int a ,int b)
    {
        System.out.println("Addition= "+(a+b));
    }
}
class StringAddition extends take{
    void concat(String s,String s1)
    {
       String as=s.concat(s1);
        System.out.println("concatenated String = "+as );
    }
}


