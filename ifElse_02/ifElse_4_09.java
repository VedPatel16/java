package ifElse_02;// return the relation b/w a and b .

import java.util.Scanner;
public class ifElse_4_09 {
    public static void main(String[] args){

        System.out.println("enter two numbers : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a==b) System.out.println("both are equal");
        else if(a>b) System.out.println("a is greater then b");
        else System.out.println("a is less then b");
    }
}
