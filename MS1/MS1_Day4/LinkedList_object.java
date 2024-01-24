package MS1_Day4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_object {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<Integer>();
        ArrayList<String> al2=new ArrayList<String>();
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Enter id and name of person "+(i+1));
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            al1.add(id);
            al2.add(name);
        }
        // System.out.println(al1);
        // System.out.println(al2);
        LinkedList<Person> ll=new LinkedList<Person>();
        for(int i=0;i<size;i++){
            Person p=new Person();
            p.id=al1.get(i);
            p.name=al2.get(i);
            ll.add(p);
        }
       for(Person p:ll){
        System.out.println(p.id+"---"+p.name);
       }
       ll.remove(1);
       System.out.println("Deleted");
       for(Person p:ll){
        System.out.println(p.id+"---"+p.name);
       }
       

    }



}
class Person{
    int id;
    String name;
}