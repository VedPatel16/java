package pattern_04;// wap to print pascal triangle
import java.util.*;
public class pattern_18_32 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no. of row");
        int n=sc.nextInt();


        for(int i=0;i<n;i++){
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                int ans=combination(i,j);
                System.out.print(ans+" ");
            }
            System.out.print("\n");
        }
    }
    public static int combination(int i,int j){
        if(j>=i) return 1;
        return fact(i)/(fact(i-j)*fact(j));
    }
    public static int fact(int x){
        int factorial=1;
        for(int i=1;i<=x;i++) factorial*=i;
        return factorial;
    }
}

//package pattern_04; // Program to print Pascal's Triangle
//import java.util.*;
//
//public class pattern_18_32 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows: ");
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            // Print spaces for alignment
//            for (int k = 0; k < n - i - 1; k++) {
//                System.out.print(" ");
//            }
//
//            // Print Pascal's triangle values
//            for (int j = 0; j <= i; j++) {
//                int ans = combination(i, j);
//                System.out.print(ans + " ");
//            }
//
//            // Move to the next line
//            System.out.println();
//        }
//    }
//
//    // Method to calculate combination (nCr)
//    public static int combination(int i, int j) {
//        if (j > i) return 0; // Prevent invalid cases
//        return fact(i) / (fact(i - j) * fact(j));
//    }
//
//    // Method to calculate factorial
//    public static int fact(int x) {
//        int factorial = 1;
//        for (int i = 1; i <= x; i++) {
//            factorial *= i;
//        }
//        return factorial;
//    }
//}
