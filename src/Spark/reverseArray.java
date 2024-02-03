 package Spark;
public class reverseArray {
    public static void main(String[] args)
    {

        int arr[]={12,43,23,53,54,6434,53,86,75,35,13,65};
        int c=0,mid=(arr.length-1)/2;
        for (int i = 0; i <arr.length; i++) {
           int l=arr[arr.length-(1+i)];
           if (i<=mid) {
               c=l;
               arr[arr.length-(1+i)]=arr[i];
               arr[i]=c;
           }
        }
        System.out.println("revers of array");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(" "+arr[j]);

        }
    }
}
