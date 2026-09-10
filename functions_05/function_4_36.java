package functions_05;// wap to print greatest among two
import java.util.*;
public class function_4_36 {
    public static void main(String[] args) {
        System.out.println(" enter two numbers.");
        int ans=getData();
        System.out.println(ans+" is greatest.");
    }

    public static int getData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first no");
        int n1=sc.nextInt();
        System.out.print("Enter second number");
        int n2=sc.nextInt();

        return max(n1,n2);
    }

    public static int max(int n1,int n2){
        if(n1>n2) return  n1;
        else return n2;

    }
}

//Another : : we can also code this problem by taking the void type of two new functions.
