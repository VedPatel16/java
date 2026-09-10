// Que.) take array of string and find cumulative or combined length of it

package string_08;
import java.util.*;
public class String_3_48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        type-1 to print string
        String surname="patel";

//        type-2 to print string
        System.out.println("enter your name.");
        String name=sc.next();

//        type-3 to print string
        String father=new String("maheshbhai");

        System.out.println("enter the size of array which is string");
        int size=sc.nextInt();
        String arr[]=new String[size];
//        for (int i=0;i<size;i++){
//        arr[i]=sc.next();
//
//        }
        int len=0;
        System.out.println("enter");
        for(int i=0;i<size;i++){
            arr[i]=sc.next();
            len+=arr[i].length();
        }
        System.out.println("actual length is "+len);


    }
}
