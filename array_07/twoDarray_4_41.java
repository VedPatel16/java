
package array_07;
import java.util.*;
public class twoDarray_4_41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][4];
        int i,j;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
