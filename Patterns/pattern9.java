/*
Input : 7
Pattern:
A B C D E F G
*/

import java.util.Scanner;

public class pattern9{
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.close();

        for(int i=0;i<n;i++){
            System.out.print((char)(65+i)+" ");
        }
    }
}