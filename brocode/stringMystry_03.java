
import java.util.*;
public class stringMystry_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name : ");
        String name=sc.nextLine();
        System.out.println("enter your age : ");
        int age=sc.nextInt();

        if(name.isEmpty()) System.out.println("you didn't enter your name .😡"); //********* new **********//
        else System.out.println("hi "+name+"!");
        System.out.println("your age is "+age);

        System.out.println(name.isEmpty());  //***********
    }
}

// for emoji press win+;
