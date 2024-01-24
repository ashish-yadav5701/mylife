package MS1_Day2.Oops1;

import java.util.Scanner;

public class Main4StaticIllustrator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter object 1 detail");
        System.out.println("Enter i1");
        int i1= sc.nextInt();
        System.out.println("Enter i2");
        int i2= sc.nextInt();
        StaticIllustration s = new StaticIllustration();
        s.setI1(i1);
        s.setI2(i2);
        s.display();
        System.out.println("Enter object 2 detail");
        System.out.println("Enter i1");
        int i3= sc.nextInt();
        System.out.println("Enter i2");
        int i4= sc.nextInt();
        StaticIllustration s2 = new StaticIllustration();
        s2.setI1(i3);
        s2.setI2(i4);
        s2.display();
        s.display();
       

    }
}
