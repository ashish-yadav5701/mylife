package MS1_Day3;

public class Overriding_1 {
    public static void main(String[] args) {
        Bike splendor= new Bike();
       splendor.run();
    }
}
class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Bike extends  Vehicle{
  @Override
    void run(){
        System.out.println("Bike is running at 60kmph");
    }
}
