package MS1_Day3;

import MS1_Day2.Oops1.Address;

public class TestOverloading1 {
    public static void main(String[] args) {
        Adder a1=new Adder();
        System.out.println(a1.add(3,5));
        System.out.println(a1.add(1.63,4,8));
    }
}

class Adder{
    public int add(int a, int b){return a+b;}
    public double add(double a, int b ,int c){return a+b+c;}
}