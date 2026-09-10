package ifElse_02;// return person is adult or not

import java.util.*;
public class simple_ifElse_06 {
    public static void main(String[] args){

        System.out.println("enter your age : ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age>18){
            System.out.println("you are eligible for voting");
        }
        else{
            System.out.println("you are not eligible for voting");
        }
    }
}
