package pattern_04;
// wap to print hollow butterfly : *        *
//                                 **      **
//                                 * *    * *
//                                 *  *  *  *
//                                 *   **   *
//                                 *   **   *
//                                 *  *  *  *
//                                 * *    * *
//                                 **      **
//                                 *        *

import java.util.Scanner;
public class pattern_17_31 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row.");
        int n=sc.nextInt();

        int i,j;
//  to print upper half triangle
        for(i=0;i<n;i++){
            for(j=0;j<2*n;j++){
                if(j==0 || j==2*n-1 || i==j || i+j==2*n-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }

//  to print lower half triangle
        for(i=n-1;i>=0;i--){
            for(j=0;j<2*n;j++){
                if(j==0 || j==2*n-1 || i==j || i+j==2*n-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
