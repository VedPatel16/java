package array_07;

import java.util.*;
public class array_1_38 {
    public static void main(String[] args) {
        int arr[]=new int[3];
        arr[0]=17;
    arr[1]=-10;
    arr[2]=19;
    for(int i=0;i<3;i++){
        System.out.println(arr[i]);
    }


    int array[]={17,11,5,44};
    for(int i=0;i<4;i++){
        System.out.println(array[i]);
    }

    System.out.println("enter the number");
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int numbers[]=new int[size];
    for(int i=0;i<size;i++){
        System.out.println(numbers[i]);
    }

    String fruits[]={ "apple","banana","grapes"};
    fruits[0]="mango";
        System.out.println(fruits[0]);    // updating is possible

    }
}
//  1) we never initialized the array but in java by default it starts with null value for character
//     for integer 0 and float store 0.0
//  2) no need to set initial values like other languages, by default it take null value.
