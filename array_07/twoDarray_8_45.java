// wap to print jalebi;

package array_07;
import java.util.*;
public class twoDarray_8_45 {
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
        int max=row*col;
        int count=0;
        int minr=0,maxr=row-1,minc=0,maxc=col-1;
        while(count<max){
            for(int i=minc;i<=maxc;i++){
                System.out.print(arr[minr][i]+" ");
                count++;
            }
            minr++;
            if(count>=max) break;
            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc]+" ");
                count++;
            }
            maxc--;
            if(count>=max) break;

            for(int i=maxc;i>=minc;i--){
                System.out.print(arr[maxr][i]+" ");
                count++;
            }
            maxr--;
            if(count>=max) break;

            for(int i=maxr;i>=minr;i--){
                System.out.print(arr[i][minc]+" ");
                count++;
            }
            minc++;
            if(count>=max) break;

        }
    }
}