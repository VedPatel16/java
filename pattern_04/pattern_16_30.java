package pattern_04;
// wap to print this pattern : 1111
//                             222
//                             33
//                             4

import java.util.Scanner;
public class pattern_16_30 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row.");
        int n=sc.nextInt();

        int i,j,k;
        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++) System.out.print(i+1);
            System.out.print("\n");
        }
    }
}
