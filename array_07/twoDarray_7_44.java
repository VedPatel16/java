// matrix multiplication

package array_07;
import java.util.*;
public class twoDarray_7_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the row and colum of array-1.");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("enter the row and colum of array-2.");
        int p = sc.nextInt();
        int q = sc.nextInt();

        if(m!=p){
            System.out.println("enter appropriate values.");
            return;
        }

        int a[][] = new int[n][m];
        int b[][] = new int[p][q];

        System.out.println("enter the element of array-1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the element of array-2");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int ans[][]=new int[n][q];
        int sum;
        for(int i=0;i<n;i++){
            for(int j=0;j<q;j++){

                sum=0;
                for(int k=0;k<m;k++){
                    sum+=a[i][k]+b[k][j];
                }
                ans[i][j]=sum;
                System.out.print(ans[i][j]);

            }
            System.out.print("\n");
        }
    }
}