package MS1_Day4;
import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList Ll1=new LinkedList();
        Ll1.add(21);
        Ll1.add(46);
        Ll1.add(432);
        Ll1.add(1,57849);
        Ll1.addFirst(39828);
        Ll1.set(0,"ekded");
        Ll1.addLast("djdodi");
        System.out.println(Ll1.get(4)); 
        System.out.println(Ll1);
        Ll1.remove(2);
        System.out.println(Ll1);
    }
}
