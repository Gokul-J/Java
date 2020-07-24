/*
Input : 7
Pattern:
1 0 1 0 1 0 1
1 1 0 0 1 1 0
1 1 1 0 0 0 1
1 1 1 1 0 0 0 
1 1 1 1 1 0 0 
1 1 1 1 1 1 0
1 1 1 1 1 1 1
*/

import java.util.Scanner;

public class pattern14{
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.close();
       
        int i,j;
        for(i=1;i<=n;i++){
            for(j=i;j<n+i;j++){
                System.out.print(((j/i)%2)+" ");              
            }
            System.out.println();
        }
    }
}