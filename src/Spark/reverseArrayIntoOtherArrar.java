package Spark;

public class reverseArrayIntoOtherArrar {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int ar[]={12,34,24,54,43,64,75,23,43,75};
//        int c=0,mid=ar.length/2,l;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=ar[ar.length-(i+1)];
        }
        System.out.println("reverse array");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(" "+arr[j]);
        }
    }
}
