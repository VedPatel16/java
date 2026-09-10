package exercise_01_06;

// wap to print the power of x^y
import java.util.*;
public class ex_1_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of base : ");
        int x=sc.nextInt();
        System.out.println("enter the value of power : ");
        int n=sc.nextInt();
        pow(x,n);
    }

    public static void pow(int x,int n){
        int pow=1;
        for(int i=1;i<=n;i++){
            pow*=x;
        }
        System.out.println(pow);
    }
}
