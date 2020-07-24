/*
Input : 4
Pattern:
      1
    2 3 2
  3 4 5 4 3
4 5 6 7 6 5 4
*/

import java.util.Scanner;

public class pattern17{
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.close();

        int i,j,t=1,r=1,p=2;
        for(i=1;i<=n;i++){
            if(i>2){
                t=t-r;
                r++;
            }
            for(j=i;j<n;j++){
                System.out.print("  ");
            }
            for(j=n+i-1;j>=n;j--){
                System.out.print(t+" ");
                t++;
            }
            for(j=1;j<i;j++){
                System.out.print(p+" ");
                p--;
            }
            p=2*i;
            System.out.println();
        }
    }
}