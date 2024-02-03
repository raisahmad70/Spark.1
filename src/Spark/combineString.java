package Spark;

public class combineString {
    public static void main(String[] args) {



        String s1 = new String("Ahmad");
        String s2 = s1.concat("Rais");
        System.out.println(s2);
        System.out.println( s2.charAt(3));
        char c;
        int mid=(s1.length()-1)/2;
        for (int i = 0; i < s1.length(); i++) {
              int l=s1.length()-(1+i);
            if(i<mid)
            {
                c=s1.charAt(i);
                s1.toCharArray()[i]=s1.toCharArray()[l];
                s1.toCharArray()[l]=c;

            }
        }
        System.out.println("Reverse String ="+s1);


    }
}
