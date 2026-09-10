package pattern_04;// palindromic pyramid
import java.util.Scanner;

public class pattern_11_25 {
    public static void main(String[] args){
        System.out.println("enter the number of raw");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i,j,k,l;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++) System.out.print(" ");
            for(k=i+1;k>0;k--) System.out.print(k);
            for(l=1;l<i+1;l++) System.out.print(l+1);
            System.out.print("\n");
        }
    }
}

// first build logic for 1/2 pyramid after reverce the next loop.