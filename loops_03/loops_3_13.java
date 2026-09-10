package loops_03;// prime numbers.

import java.util.*;
public class loops_3_13{
    public static void main(String[] args){
        System.out.println("enter the number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num<=1){
            System.out.println(" number is not prime number.");
            return;
        } // negative numbers are not prime.

        boolean isPrime=true;

        for(int i=2;i<num;i++){
            if(num%i==0) {
                isPrime=false;
                break;
            }
        }
        if(isPrime==false) System.out.println("not prime");
        else System.out.println("prime");
    }
}
