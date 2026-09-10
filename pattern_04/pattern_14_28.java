package pattern_04;// '

// hollow rhombus
import java.util.*;
public class pattern_14_28 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row.");
        int n=sc.nextInt();

        int i,j,k;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++) System.out.print(" ");
            for(k=0;k<n;k++) {
                if(i==0 || i==n-1 || k==0 || k==n-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
