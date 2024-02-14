package Spark;

public class Exceptions {
    public static void main(String[] args) throws Exception {
        inException90();

    }
     static void inException90(){
         System.out.println("Smile please");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e)
        {
            System.out.println("airthmatic");

        } catch (Exception e)
        {
            System.out.println("i am error");
        } finally
        {
            System.out.println("mai na ruknewal");
        }

     }

}
