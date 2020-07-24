/*
Input : 4

Pattern:
1357
3571
5713
7135
*/

import java.util.Scanner;

public class pattern5{
    public static void main(String[] args){
        System.out.print("Enter the Number : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        n*=2;
        for(int i=1;i<=n;i+=2){
            for(int j=i;j<n+i;j+=2){
                System.out.print((j-1)%n+1);
            }
        System.out.println("");
        }
    }
}