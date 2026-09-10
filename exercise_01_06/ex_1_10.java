package exercise_01_06;

// wap to print fibonacci series using methods.
import java.util.*;
public class ex_1_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number of term till yoy want to print fibonacci series : ");
        int n=sc.nextInt();
        fibo(n);
    }

    public static void fibo(int n){
        int count=0;
        int a=0,b=1,sum=1;
        while(count<n){
            System.out.println(a);
            a=b;
            b=sum;
            sum=a+b;
            count++;
        }
    }
}

// 1) using recursion we can do but in main function we have to run for loop for each term of series.
//    to print each term recursive call will be done.

// 2) for printing n th term of series ,recursion is best option.