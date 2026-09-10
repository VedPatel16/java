package pattern_04;//

// print rhombus

import java.util.*;
public class pattern_8_22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row");
        int n=sc.nextInt();

        int i,j,k;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++) System.out.print(" ");
            for(k=0;k<n;k++) System.out.print("*");

//            for(j=0;j<2*n-1;j++){
//                if(j<=n-i-1) System.out.print(" ");
//                if(j>n-i-1 && j<=) System.out.print("*");
//            }
            System.out.print("\n");
        }
    }
}
