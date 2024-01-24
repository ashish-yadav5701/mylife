package MS1_Day2.Oops1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       //for address calss
       String street=sc.nextLine();
        String city=sc.nextLine();
        String country=sc.nextLine();
        int pincode=Integer.parseInt(sc.nextLine());
        Address ad=new Address();
        ad.street=street;
        ad.city=city;
        ad.country=country;
        ad.pincode=pincode;
        ad.displayAddress();
        //for customer class
        String name=sc.nextLine();
        String email=sc.nextLine();
        String type=sc.nextLine();
        String location=sc.nextLine();
        Customer c1=new Customer(name, email, type, location);
        System.out.println("name::"+c1.getCutomerName());
        System.out.println("Email::"+c1.getCutomerEmail());
        System.out.println("Type of customer::"+c1.getCutomerType());
        System.out.println("Location::"+c1.getCutomerLocation());

    }
}
