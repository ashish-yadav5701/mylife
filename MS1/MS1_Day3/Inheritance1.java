package MS1_Day3;

public class Inheritance1 {
    public static void main(String[] args) {
        Trainee t1= new Trainee();
        System.out.println(t1.salary);
      t1.calling();
        System.out.println(t1.probation_month);
    }
}
class Employee2{
    // Employee2(){
    //     System.out.println("no argument constructor");
    // }
    Employee2(String location){
        System.out.println("Employee constructor intialized"+location);
    }
    public void calling(){
        System.out.println("parent method called");
    }
     int salary=56383;
}
class Trainee extends Employee2{
  
  public Trainee(){
    super("====sdhjjd");
    System.out.println("child constructor");}

    public Trainee(int id, String name){
        super("====hjdsbjhs");
        System.out.println(id+" "+name);}

   int probation_month=5;
}