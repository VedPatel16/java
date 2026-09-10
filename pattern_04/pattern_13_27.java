package pattern_04;// number pyramid

import java.util.Scanner;
public class pattern_13_27 {
        public static void main(String[] args){
            System.out.println("enter the number of raw");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            int i,j,k;
            for(i=0;i<n;i++){
                for(j=0;j<n-i-1;j++) System.out.print(" ");  // agad space print karava mate aava badhama total space=n-i
                for(k=0;k<i+1;k++) System.out.print(i+1+" ");
                System.out.print("\n");
            }
        }
}
