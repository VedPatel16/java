package basics_01;// q--> sum of two numbers

import java.util.*; // util.scanner pan chale.
public class input_Q1_05 {
    public static void main(String [] args){
        System.out.println("enter two numbers..");

        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();  // compulsary i capital
        int num2=sc.nextInt();

        int ans=num1+num2;
        System.out.println("sum is : "+ans);
    }
}
