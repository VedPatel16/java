package functions_05;// wap to print given number is prime or not using function
import java.util.*;
public class function_5_37 {
    public static void main(String[] args) {
        System.out.println("enter the number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primeCheck(n);

    }

    public static void primeCheck(int n){
        if(n<=1){
            System.out.println(n+" is not prime number.");
            return;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println(n+" is not prime number");
                return;
            }
        }

        System.out.println(n + " is prime number");
    }
}
