package collectionSpark;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Linklist {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to store Array list");
        for (int i = 1; i < 5; i++) {
            a.add(i * 3);
        }
        for (int i = 1; i < a.size(); i++)
        {
            System.out.println(a.get(i));
        }
//        for (Integer d:a)
//        {
//            System.out.println(d);
//        }
//        Iterator s=a.iterator();
//        while (s.hasNext())
//        {
//            System.out.println(s.next());
//        }




    }


}
