package MS1_Day4;

import javax.sound.midi.MidiUnavailableException;

import MS1_Day2.Oops1.Main;

public class Custom_Exceptions {
    private static double attendance[]={78,38,72,89,81};
    private static String name[]={"asd","fgh","qwe","ytr","uty"};
    
    public static void main(String[] args) {
       try {
            for(int i=0;i<5;i++){
                    System.out.println(name[i]+"\t"+attendance[i]);
                    if(attendance[i]<75){
                        DebarredException de=new DebarredException("is Not eligible for exam",name[i]);
                        throw de;
                    }
                }
       }
       catch(DebarredException e){
                System.out.println(e.name+e.getMessage());
       }
    }
}

class DebarredException extends Exception{
    String name;
     DebarredException(){}

     DebarredException(String msg,String name){super(msg);
    this.name=name;}
}