/*
Input : 7
Pattern:
1 2 3 4 5 6 7
*/

import java.util.Scanner;

public class pattern15{
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.close();

        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}