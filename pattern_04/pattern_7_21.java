package pattern_04;// 0-1 triangle

import java.util.Scanner;

public class pattern_7_21 {
    public static void main(String[] args){
        System.out.println("enter the number of raw");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if((i+j)%2==1) System.out.print("0");
                else System.out.print("1");
            }
            System.out.print("\n");
        }
    }
}
// logic is that put "0" at odd places and "1" at even places....