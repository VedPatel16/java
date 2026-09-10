// wap to
package exercise_01_06;
import java.util.*;
public class ex_1_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        float n;
        int pCount=0,zCount=0,nCount=0;
        do{
            System.out.println("enter 1 to insert number \n enter 0 to stop.");
            choice=sc.nextInt();
            if(choice==1){
                System.out.println("enter the number");
                n=sc.nextFloat();
                if(n==0) zCount++;
                else if(n<0) nCount++;
                else pCount++;
                }

            else if(choice!=0) System.out.println("enter appropriate choice.");

        }while(choice!=0);
        System.out.println(pCount);
        System.out.println(nCount);
        System.out.println(zCount);

    }
}
