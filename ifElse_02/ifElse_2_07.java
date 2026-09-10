package ifElse_02;

// returns that given no. is even or odd.
import java.util.*;
public class ifElse_2_07 {
    public static void main(String[] args){

        System.out.println("enter integer number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println(num+" is even number.");
        }
        else{
            System.out.println(num+" is odd number.");
        }
    }
}
