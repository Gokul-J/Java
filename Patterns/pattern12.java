/*
Input : 7
Pattern:
7
67
567
4567
34567
234567
1234567 
*/

import java.util.Scanner;

public class pattern12{
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.close();

        int i,j;
        for(i=n;i>0;i--){
            for(j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}