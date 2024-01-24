package MS1_Day3;

public class Interface_1 {
    public static void main(String[] args) {
        Bank1 b=new Sbi1();
        System.out.println(b.getROI());
       
    }
}
interface Bank1{
    int getROI();
}
class Sbi1 implements Bank1{

    @Override
    public int getROI() {
         return 7;
    }
    
}
class ICICI1 implements Bank1{

    @Override
    public int getROI() {
         return 9;
    }
    
}
class Axis1 implements Bank1{

    @Override
    public int getROI() {
         return 6;
    }
    
}
