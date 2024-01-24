package MS1_Day3;

public class Overloading2 {
    public static void main(String[] args) {
        Employee e1=new Employee(); 
        Employee e2=new Employee();
        System.out.printf("salary bonus for permanent employee::%.2f\n",e1.calcBonus(1432.3));
        System.out.printf("salary bonus for trainee employee::%.2f\n",e2.calcBonus(63,805.3));
        //
        CommonParameter cp1=new CommonParameter();
        System.out.println(cp1.sum(2323, 22222));
        System.out.println(cp1.sum((long)2000037, (long)387366));

    }
}
class Employee{
    public double calcBonus(double basicSalary){
          double bonus=basicSalary*1.5;
          return bonus;
    }
    public double calcBonus(int days,double daySalary){
        double bonus = days*daySalary;
        return bonus;
    }
}
class CommonParameter{
     int  sum(int a, int b){return a+b;}
     long sum(long a, long b){return a+b;}
}
