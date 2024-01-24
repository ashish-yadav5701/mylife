package MS1_Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionSort {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       sc.nextLine();
       HashSet<Employee> al=new HashSet<Employee>();
       for(int i=0;i<size;i++){
                String name= sc.nextLine();
                Employee e=new Employee(i+1, name);
                al.add(e);
       }
      Iterator<Employee> it= al.iterator();
       while(it.hasNext()){
        Employee e=it.next();
        System.out.println(e.id+"-----"+e.name);
       }
       
    }
}
class Employee{
    String name;
    int id;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
}
