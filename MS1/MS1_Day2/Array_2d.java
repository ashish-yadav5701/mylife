package MS1_Day2;

import java.util.Scanner;

public class Array_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        System.out.println("enter row and col no for matrix 1:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("enter row and col no for matrix 2:");
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        int[][] arr=new int[row][col];
        int[][] arr2=new int[row2][col2];
        System.out.println("enter elements for matrix 1:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter elements  for matrix 2:");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
       if((row==row2) && (col==col2)){  
        for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          if((arr[i][j])!=(arr2[i][j])){
            flag=false;
            break;
          }
          
        }
        if(flag==false){
            break;
          }
      }
}else{
    flag=false;
}
if(flag){
    System.out.println("matrix is equal");
}
else{
    System.out.println("matrix is not equal");
}
      
    }
}
