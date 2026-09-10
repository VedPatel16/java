package pattern_04;// wap to print half pyramid

import java.util.*;
public class pattern_3_17 {
    public static void main(String[] args){
        System.out.println("enter the number of raw");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
