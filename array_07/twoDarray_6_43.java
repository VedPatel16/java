// (Q-1)print transpose of matrix
// (Q-2)rotate 90 degree ma transpose and flip term.

package array_07;
import java.util.*;
public class twoDarray_6_43 {
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
//        int max=0,sum,rowAns=0;
        for(int i=0;i<col;i++){
            for(int j=0;j<col;j++){     // for rotating 90 degree  :  int j=col-1;j>=0;j--
                System.out.print(arr[j][i]);
            }
            System.out.print("\n");
        }
    }
}
