package MS1_Day2.Oops1;

import java.util.Scanner;

public class Constructor1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student s1=new Student(111, "Ashish", 280.32f);
        s1.display();
        Student s2=new Student(113, "Ajds", 223.32f);
        s2.display();
        String name=sc.nextLine();
        int rollNo=sc.nextInt();
        float fee= sc.nextFloat();
        Student s= new Student(rollNo, name, fee);
        System.out.println(s.name+"\n"+s.rollNo+"\n"+s.fee);
    }
}
class Student{
    int rollNo;
    String name;
    float fee;
    Student(int rollNo,String name,float fee){
        this.rollNo=rollNo;
        this.name=name;
        this.fee=fee;
    }
    public void display(){
        System.out.println(name+"\n"+rollNo+"\n"+fee);
    }
}
