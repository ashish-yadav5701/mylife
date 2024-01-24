package MS1_Day3;

public class Overriding_Coavriant {
    Overriding_Coavriant get(){return this;}
}
class B1 extends Overriding_Coavriant{
    B1 get(){return this;}
    void message(){System.out.println("Welcome to covariant return type");}
    public static void main(String[] args){
        new B1().get().message();
    }
}
