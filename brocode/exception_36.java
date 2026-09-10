// Exception = An event that interrupts the normal flow of a program
//                      (Dividing by zero, file not found, mismatch input type)
//                      Surround any dangerous code with a try{} block
//                      try{}, catch{}, finally{}

import java.util.*;

public class exception_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("we are doing quotient");
            System.out.println("enter the numerator");
            double numerator = sc.nextInt();
            System.out.println("Enter the denominator");
            double denominator = sc.nextInt();
            System.out.println("answer is "+numerator / denominator);
        }
        catch (InputMismatchException e) {
            System.out.println("it is not a number");
        }
        catch (ArithmeticException e) {
            System.out.println("you can't divide by zero");
        }
        catch (Exception e) {
            System.out.println("something went wrong");
        }

        finally {
            sc.close();
            System.out.println("it is finally block");
            System.out.println("this always runs");
        }

    }
}
