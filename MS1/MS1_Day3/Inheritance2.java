package MS1_Day3;

public class Inheritance2 {
    public static void main(String[] args) {
        Emp e1 = new Emp("joe", "05/02/1993", "texas", 52, 1652, 2);
        e1.displayEmp();
    }
   
}
class Person{
    String name,dob;
    String address;
    int age;
    Person(String name, String dob, String address, int age){
          this.name= name;
          this.address=address;
          this.age=age;
          this.dob=dob;
    }
    void displayPerson(){
      System.out.println("name::"+name);
      System.out.println("dob::"+dob);
      System.out.println("age::"+age);
      System.out.println("address::"+address);
    }
    
}
class Emp extends Person{
    int id;
    int salary;
    Emp(String name,String dob, String address, int age,int id,int salary){
         super(name,dob,address,age);
         this.id=id;
         this.salary=salary;
    }
    void displayEmp(){
        displayPerson();
        System.out.println("id:::"+id);
        System.out.println("salary ::"+salary);
    }
}