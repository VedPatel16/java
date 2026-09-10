// find the row which contain maximum sum of element.

package array_07;
import java.util.*;
public class twoDarray_5_42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row and colum of array.");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("enter the element of array.");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=0,sum,rowNumber=0;
        for(int i=0;i<row;i++){
            sum=0;
            for(int j=0;j<col;j++){
                sum+=arr[i][j];
            }
            if(sum>=max){
                max=sum;
               rowNumber=i+1;
            }
        }

        System.out.println("row is "+rowNumber+" and max. sum is "+max);

    }

}
