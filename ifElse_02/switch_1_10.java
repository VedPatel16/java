package ifElse_02;
// if else if ladder is not good option for very large number of option or choices.
// for selecting from multiple option and print according o/p switch statement is used.

// make calculator

import java.util.*;
public class switch_1_10 {
public static void main(String[] args){

    System.out.println("enter two numbers : ");
    Scanner sc=new Scanner(System.in);
    float a=sc.nextFloat();
    float b=sc.nextFloat();

    System.out.println(" choices : \n" +
            " 1 : sum\n" +
            " 2 : difference\n" +
            " 3 : multiplication\n" +
            " 4 : division\n" +
            " 5 : modulo\n");

    int choice=sc.nextInt();
    switch(choice){
        case 1:
            System.out.println(a+b);
            break;
        case 2:
            System.out.println(a-b);
            break;
        case 3:
            System.out.println(a*b);
            break;
        case 4:
            System.out.println(a/b);
            break;
        case 5:
            System.out.println(a%b);
            break;
        default:
            System.out.println("Invalid Choice");
            break;

    }

}
}
