package pattern_04;// wap to print 180 deg. rotated pyramid

import java.util.*;
public class pattern_5_19 {
    public static void main(String[] args){
        System.out.println("enter the number of raw");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i,j,k;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++) System.out.print(" ");
            for(k=0;k<n-j;k++) System.out.print("*");  // logic : total n place and n=no.of space+no. of stars
//                        OR  ( for star printing )
//          for(k=0;k<i+1;K++) print("*")
            System.out.print("\n");
        }
    }
}
