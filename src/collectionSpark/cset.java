package collectionSpark;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class cset {
    public static void main(String[] args) {
        List<Integer> ar=new LinkedList<>();
        ar.add(122);
        ar.add(13);
        ar.add(14);
        ar.add(15);
        ar.add(16);
        ar.add(17);
        ar.set(2,23+1);
        ar.add(1,11+11);
        Iterator it=ar.listIterator();
        if (ar.isEmpty()) {
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
        }else
            System.out.println("mau hu =>"+Thread.currentThread().getName());
    }
}
