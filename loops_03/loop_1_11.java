package loops_03;

import java.util.*;
public class loop_1_11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your name : ");
        String name=sc.nextLine();
        System.out.println("enter number of time you want your name printed : ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++) System.out.println(name);

    }
}
