// print the maximum and minimum number in the array.

package array_07;
import java.util.*;
public class array_3_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[300];
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max=arr[i];
        }
        System.out.println("maximum number is "+max+"\n minimum number is "+min);



    }
}