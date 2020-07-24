/*
Input : 5
Pattern:
      *
     *#*
    *#*#*
   *#*#*#*
  *#*#*#*#* 
*/

import java.util.Scanner;

public class pattern11{
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=i;j<n;j++){
                System.out.print(" ");
            }
            for(j=1;j<i*2;j++){
                System.out.print(j%2==0?"#":"*");
            }
            System.out.println("");
        }
    }
}
