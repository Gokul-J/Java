/*
Input : 5
Pattern:
55555
54444
54333
54322
54321
*/

import java.util.Scanner;

public class pattern4{
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int i,j;
        for(i=n;i>0;i--){
            for(j=n;j>0;j--){
                /*if(j>=i){
                    System.out.print(j);
                }
                else{
                    System.out.print(i);
                }*/
                System.out.print(j>=i?j:i);
            }
        System.out.println("");
        }

    }
}