//program to print a m*n matrix in spiral form...
/*
Input:
1  2  3  4
5  6  7  8
9 10 11 12

Output : 1 2 3 4 8 12 11 10 9 5 6 7
*/

import java.util.Scanner;
public class spiralFormOfMatrix {

    int getinput(){
        Scanner in=new Scanner(System.in);
        int value = in.nextInt();
        in.close();
        return value;
    }
    public static void main(String[] args){
        spiralFormOfMatrix s = new spiralFormOfMatrix();
        System.out.print("No. of rows : ");
        int m = s.getinput();
        System.out.print("No. of columns : ");
        int n = s.getinput();
        int i,j;
        int[][] matrix = new int[m+1][n+1];
        System.out.println("Enter the elements of Matrix :");
        for(i=1;i<=m;i++){
            for(j=1;j<=n;j++){
                matrix[i][j]=s.getinput();
            }
        }
        System.out.println("Matrix Elements :");
        for(i=1;i<=m;i++){
            for(j=1;j<=n;j++){
                
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        s.spiral(matrix,m,n);
    }

    void spiral(int a[][], int m, int n){
        int startrow = 1, endrow = m;
        int startcol = 1, endcol = n;
        int i;
        System.out.println("Spiral Order :");
        while(startrow<=endrow && startcol<=endcol){
            for(i=startcol;i<=endcol;i++){
                System.out.print(a[startrow][i]+" ");
            }
            startrow++;
            for(i=startrow;i<=endrow;i++){
                System.out.print(a[i][endcol]+" ");
            }
            endcol--;
            if(startrow<=endrow){
                for(i=endcol;i>=startcol;i--){
                    System.out.print(a[endrow][i]+" ");
                }
            }
            endrow--;
            if(startcol<=endcol){
                for(i=endrow;i>=startrow;i--){
                    System.out.print(a[i][startcol]+" ");
                }
            }
            startcol++;
        }
        System.out.println();

    }

}