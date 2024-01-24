package MS1_Day2.Oops1;

public class Customer {
    private String customerName;
    private String customerEmail;
    private String customerType;
    private String customerLocation;
    public Customer(String name, String email, String type, String location){
        customerName=name;
        customerEmail=email;
        customerType=type;
        customerLocation=location;
    }
    public String getCutomerName(){
        return customerName;
    }
    public String getCutomerEmail(){
        return customerEmail;
    }
    public String getCutomerType(){
        return customerType;
    }
    public String getCutomerLocation(){
        return customerLocation;
    }
}
