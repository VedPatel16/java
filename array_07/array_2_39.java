// take array from user and search for given number x and print the index at which it occurs.

// concept we have used is "linear search".

package array_07;
import java.util.*;
public class array_2_39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size;
        System.out.println("enter the size of array.");
        size=sc.nextInt();
        System.out.println("enter the element of array.");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the value you want to find.");
        int val= sc.nextInt();
        int i;
        for(i=0;i<size;i++){
            if(val==arr[i]) break;
        }
        System.out.println("index of "+val+" is "+i);

        System.out.println(arr.length); // it in built fxn. of array which gives the length of array.
    }
}
