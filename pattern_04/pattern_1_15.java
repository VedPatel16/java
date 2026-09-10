package pattern_04;// wap to print solid rectangle
import java.util.*;
public class pattern_1_15 {
    public static void main(String[]args){
        System.out.println("enter the number of raw and colum.");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
