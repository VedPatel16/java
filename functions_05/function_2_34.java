package functions_05;// wap to print sum of two numbers using methods
import java.util.*;
public class function_2_34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sumNumber(n1,n2);
    }

    public static void sumNumber(int n1,int n2){
        System.out.println(n1+n2);
    }
}
