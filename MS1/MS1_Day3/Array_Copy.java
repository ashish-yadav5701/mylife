package MS1_Day3;

public class Array_Copy {
    public static void main(String[] args) {
        char[] Arr1={'j','a','v','a','p','y','t','h','o','n'};
        char []pArray= new char[8];
          System.arraycopy(Arr1, 4, pArray, 1, 6); 
        for(char i:pArray){
            System.out.println(i);
        } 
        pArray=Arr1.clone();
        System.out.println("cloned array");
        for(char i:pArray){
            System.out.println(i);
        } 
      }
}
