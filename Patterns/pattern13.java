/*
Input : 7
Pattern:
1 0 0 0 0 0 0
1 1 0 0 0 0 0
1 1 1 0 0 0 0
1 1 1 1 0 0 0
1 1 1 1 1 0 0
1 1 1 1 1 1 0
1 1 1 1 1 1 1
*/

import java.util.Scanner;

public class pattern13{
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.close();

        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}