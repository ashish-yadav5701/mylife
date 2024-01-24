package MS1_Day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet1 {
    private static boolean add;

    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(6);
        al1.add(3);
        al1.add(2);
        al1.add(5);
        add = al1.add(5);
        ArrayList al2=new ArrayList<>();
        al2.add(43);
        al2.add(5);
        al2.add(2);
        HashSet hs1=new HashSet(al1);
        System.out.println(" hash set"+hs1);
        LinkedHashSet lhs1=new LinkedHashSet(al2);
        System.out.println("Linked hash set"+lhs1);
        hs1.retainAll(lhs1);
       
        System.out.println("intersection hash set ^ linked hash set"+hs1);
        hs1.addAll(lhs1);
        System.out.println("Union hash set v linked hash set"+hs1);
     
    //     LinkedHashSet lhs2=new LinkedHashSet(hs1);
    //    add = al1.add(5);
    //     HashSet hs1=new HashSet(al1);
       
    //     LinkedHashSet lhs1=new LinkedHashSet(new ArrayList<Integer>(1,2,3,4)));
    //     LinkedHashSet lhs2=new LinkedHashSet(hs1);
    //     System.out.println(hs1.remove(2)); 
    //     System.out.println(lhs1);
    //     System.out.println("hashSet"+hs1);
    //     hs1.retainAll(lhs1);
    //     System.out.println("Retain all"+hs1);

    }
}
