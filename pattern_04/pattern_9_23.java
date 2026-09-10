package pattern_04;//pyramid

import java.util.Scanner;
public class pattern_9_23 {
    public static void main(String[] args){
        System.out.println("enter the number of raw");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i,j,k;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++) System.out.print(" ");
            for(k=0;k<2*i+1;k++) System.out.print(i+1);
            System.out.print("\n");
        }
    }
}
