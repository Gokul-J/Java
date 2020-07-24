/*
Input : 4

Pattern:
1
12
123
1234
321
21
1
*/

import java.util.Scanner;

public class pattern6{
    public static void main(String[] args){
        System.out.print("Enter the Number : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int i,j,t;
        for(i=-n+1;i<=n;i++){
            t=n-Math.abs(i);
            for(j=1;j<=t;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
} 