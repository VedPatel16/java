package exercise_01_06;

// wap to print greatest common divisor of two numbers using functions.
import java.util.*;
public class ex_1_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        gcd(n1,n2);
    }
    public static void gcd(int n1,int n2){
        int small=small(n1,n2);
        for(int i=small;i>0;i--){  // to optimise code we run reverse loop.
            if(n1%i==0 && n2%i==0) {
                System.out.println("gcd is "+i);
                break;
            }
        }
    }

    public static int small(int n1,int n2){
        if(n1<n2) return n1;
        else return n2;
    }
}


