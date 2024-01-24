package MS1_Day4;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {
    public static void main(String[] args) {
    ArrayList<Object> al1= new ArrayList<Object>(5);
    ArrayList<Integer> al2= new ArrayList<Integer>(5);
    al1.add(1);
    al1.add(10);
    al1.add(43);
    al1.add(73);
    al1.add("rtdtrdtr");
    al1.add(3,89);
    al2.add(74);
    al2.add(538);
    al1.add(al2);
    al1.addAll(al2);
    ListIterator iterator=al1.listIterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
    System.out.println(al1);
    }
    
}
