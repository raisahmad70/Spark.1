package Spark;
// single level inheritance

import java.util.Scanner;


public class inheritance1 extends implememt {
    public static void main(String[] args) {
        implememt em=new implememt();
        int input = em.input();
        em.print(input);


    }
}
class implememt
{
   int input()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter your number...");
       int n=sc.nextInt();
       return n;
   }
   void print(int n)
   {
       System.out.println("Table of "+n+"th number");
       for (int i=1;i<=10;i++)
       {
           System.out.println(n+" * "+i+" = "+n*i);
       }
   }

}
