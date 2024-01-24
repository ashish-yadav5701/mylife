package MS1_Day5;
import java.util.*;
public class HashMap_test1 {
    public static void main(String[] args) {
        HashMap hm=new HashMap<>();
        hm.put(1,"ajsj");
        hm.put(2,"sdj");
        hm.put(3,"rixm");
        hm.put(2, "hmas");
        for(int i=0;i<3;i++){
 System.out.println("key"+(i+1)+"-->"+hm.get(i+1));
        }
       
    
       Iterator it= hm.entrySet().iterator();
       
       while(it.hasNext()){
        Map.Entry m= (Map.Entry)it.next();
        System.out.println(m.getKey()+"-----"+m.getValue());
       }
    }
}
