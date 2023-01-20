package oops.inheritance;

public class TwoDimArrays {
    public static void main(String[] args) {

       int a[][] = {{2,5,7,10},
               {3,5,6,8},
               {1,5,8,4}};
       int b[][] = new int[3][4];
       for(int i= 0;i<3;i++){
           for(int j=0 ;j<4;j++){
               System.out.print(a[i][j] + " ");
           }
           System.out.println();
       }
    }
}
