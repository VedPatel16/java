package pattern_04;
// wap to print this pattern :  1
//                              12
//                              123
//                              1234

import java.util.Scanner;
public class pattern_15_29 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row.");
        int n=sc.nextInt();

        int i,j,k;
        for(i=0;i<n;i++){
            for(j=0;j<i+1;j++) System.out.print(j+1);
            System.out.print("\n");
        }
    }
}
