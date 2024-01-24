package MS1_Day2;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        long sum=0;
       //taking input from user
       //mistake1: 
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
          sum+=arr[i];
        }
        System.out.println(sum);
        //greatest element and smallest element and their index;
        int max=arr[0];
        int min=arr[0];
        int index=0;
        int index2=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=max){
              max=arr[i];
              index=i;
            }
            if(arr[i]<min){
              min=arr[i];
              index2=i;
            }
          
        }
        System.out.println(max+" "+index);
        System.out.println(min+" "+index2);


        sc.close();
    }
}
