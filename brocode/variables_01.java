// format specifier and escape sequence
import java.util.*;
public class variables_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        first

        boolean isGreat=true;
        if(isGreat) System.out.println("it is great");  // ********* new **********
        else System.out.println("is not great");

//        second

        System.out.println("enter your age");
        int age=sc.nextInt();
        sc.nextLine();   // ******************************************************
        System.out.println("enter your favourite colour");
        String colour=sc.nextLine();
        System.out.println("your age is "+age+" and your favourite colour is "+colour);
        System.out.println("are you a student say true/false");
        boolean isStudent=sc.nextBoolean();
        sc.close();
    }
}

// variables : is a reusable container for value
//         1) primitive : simple value stored directly in memory (stack)
//         2) reference : memory address (stack) that points to the (heap)
//                          string* ,array,objects