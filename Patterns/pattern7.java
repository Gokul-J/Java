/*
Input : 13
Pattern:
1
2 3
4 5 6
7 8 9 10
11 12 13
*/

import java.util.Scanner;

public class pattern7{
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.close();

        int temp = 1;
        int j=1;
        while(j<n){
            for(int i=1;i<=temp;i++){
                System.out.print(j+" ");
                j++;
                if(j>13){break;}
            }
        System.out.println("");
        temp++;
        }
    }
}