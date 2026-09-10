package functions_05;// wap to print factorial of given number
//import java.util.*;
//public class function_3_35 {
//    public static void main(String[] args) {
//        System.out.println(" enter the number ");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int fact=factorial(n);
//        System.out.println(fact);
//    }
//
//    public static int factorial(int n){
//        if(n<=1) return 1;
//        return n*factorial(n-1);
//    }
//}
// we can do it also by  the loop within the factorial method

import java.util.*;
public class function_3_35{
    public static void main(String[] args) {
        System.out.println("enter the number you want to do factorial");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fact(n));

    }
    static int fact(int n){
        if(n<=1) return 1;
        return n*fact(n-1);
    }

}