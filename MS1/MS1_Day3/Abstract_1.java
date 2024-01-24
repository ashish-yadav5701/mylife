package MS1_Day3;

public class Abstract_1 {
    public static void main(String[] args) {
        SBI b1= new SBI();
        System.out.println(b1.getROI()); 
    }
}
abstract class Bank{
    abstract int getROI();
}
class SBI extends Bank{

    @Override
    int getROI() {
        return 7;
    }
    
}
class Axis extends Bank{

    @Override
    int getROI() {
        return 8;
    }
    
}
class ICICI extends Bank{

    @Override
    int getROI() {
        return 12;
    }
    
}
