package pattern_04;// floyd's triangle
import java.util.*;
public class pattern_6_20 {
    public static void main(String[] args){
        System.out.println("enter the number of raw");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                count++;
                System.out.print(count);
            }
            System.out.print("\n");
        }
    }
}
