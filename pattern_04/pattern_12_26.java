package pattern_04;// butterfly

import java.util.Scanner;

public class pattern_12_26 {
    public static void main(String[] args){
            System.out.println("enter the number of row");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            int i,j;
//  printing upper half triangle
            for(i=0;i<n;i++){
                for(j=0;j<2*n;j++){
                    if(j<=i || j>2*n-2-i) System.out.print("*");
// **** logic **** for star printing : by observation -> no. of space in row = 2n-2-2i & no. of left star  = i
//                 next triangle starting star no. = no. of old star + no. of space.
                    else System.out.print(" ");
                }
                System.out.print("\n");
            }
//  printing lower half triangle
        for(i=n-1;i>=0;i--){
            for(j=0;j<2*n;j++){
                if(j<=i || j>2*n-2-i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}

// main logic part in this type of question is to identify the relation b/w no. of spaces and row number and n.

// first think 1/4 part of whole question. first count space of 1/4 part.
