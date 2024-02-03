package Spark;

public class GreaterNumber {
    public static void main(String[] args) {
        int arr[]={12,43,54,53,34,};
        int greater=arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>greater)
                greater=arr[i];


        }
        System.out.println("Greater number = "+greater);
    }
}
