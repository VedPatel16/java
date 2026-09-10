package loops_03;

import java.util.*;
public class loops_fibo_2_12 {
    public static void main(String[] args){
        System.out.println("enter the number till you want to print fibonacci series : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n<=0){
            System.out.println(" number should be greater then 0.");
            return;
        }

        int a=0,b=1,ans;
        int count=0;
        while(count<n){
            System.out.println(a);
            ans=a+b;
            a=b;
            b=ans;
            count++;
        }
    }
}
