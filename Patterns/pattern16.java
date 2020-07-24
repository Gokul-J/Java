/*
Input : 4
Pattern:
         1
      2 1 1 2
   3 2 1   1 2 3
4 3 2 1     1 2 3 4
   3 2 1   1 2 3
      2 1 1 2
         1
*/

import java.util.Scanner;

public class pattern16{
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.close();

        int i,j;
        for(i=-n+1;i<n;i++){
            for(j=1;j<=Math.abs(i);j++){
                System.out.print("   ");
            }
            for(j=n-Math.abs(i);j>0;j--){
                System.out.print(j+" ");
            }
            for(j=2;j<n-Math.abs(i);j++){
                System.out.print("  ");
            }
            /*for(j=1;j<=n-Math.abs(i);j++){
                if(Math.abs(i)==3){break;}
                System.out.print(j+" ");
            }*/
            //.....OR.....//
            for(j=((Math.abs(i)+1)==n?2:1);j<=n-Math.abs(i);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}