package pattern_04;// sakkarpara

import java.util.Scanner;
public class pattern_10_24 {
    public static void main(String[] args){
        System.out.println("enter the number of raw");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i,j=17,k;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(k=0;k<2*i+1;k++) System.out.print("*");
            System.out.print("\n");
        }
        System.out.println(j);
        System.out.println(i);

        for(i=n-2;i>=0;i--){
            for(j=0;j<n-i-1;j++) System.out.print(" ");
            for(k=0;k<2*i+1;k++) System.out.print("*");
            System.out.print("\n");
        }
    }
}
