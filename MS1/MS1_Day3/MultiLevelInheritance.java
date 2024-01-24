package MS1_Day3;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        AfricanRhino ar=new AfricanRhino(889,"land animal","doxer");
    ar.grazing();
    //ar.eat();
    //ar.usp();
    }
    
}
class Animal{
    Animal(String type){
           System.out.println("this is a "+type);
    }
    void eat(){
        System.out.println("eating");
    }
}
class Rhino extends Animal{
    String name;
    Rhino(String name, String type){
        super(type);
        this.name=name;

    }
    void grazing(){
        System.out.println(name+" is eating grass");
    }
}
class AfricanRhino extends Rhino{
    AfricanRhino(int weight,String type,String name){
        super(name,type);
        System.out.println("weight::"+weight);
    }
    void usp(){
        System.out.println("heaviest");
    }
}
