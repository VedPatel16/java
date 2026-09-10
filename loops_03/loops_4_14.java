package loops_03;// manu driven program : 1 for marks entry and 0 for stop.
// marks > 90 good : 60<=marks<=89 also good : 50<=marks<=59 good as well , marks don't matter.

import java.util.*;
public class loops_4_14{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int choice;
        float marks;
        do{
            System.out.println("press 1 for marks entry and 0 for exit.");
//          int choice=sc.nextInt(); -> will give error. -> must define loop variable out of loop
            choice=sc.nextInt();

            if(choice==1){
                System.out.println("please enter the marks");
                marks=sc.nextFloat();
                if(marks<=100 && marks>=90){
                    System.out.println("good");
                }
                else if(marks<= 89 && marks>=60){
                    System.out.println("also good");
                }
                else if (marks <= 59 && marks >=0) {
                    System.out.println("good as well");
                }
                else{
                    System.out.println("enter appropriate marks");
                }
            }
            else if(choice!=0) System.out.println("enter appropriate choice");

        }while(choice!=0);
    }
}
