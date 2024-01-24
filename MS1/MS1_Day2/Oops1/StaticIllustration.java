package MS1_Day2.Oops1;

import java.util.Scanner;

class StaticIllustration {
    private int i1;
    private static int i2;
    public void setI1(int i1){
          this.i1=i1;
    }
    public void setI2(int i2){
        this.i2=i2;
    }
    void display(){
       System.out.println("i1 = "+i1+"\ni2 = "+i2);
    }
}
