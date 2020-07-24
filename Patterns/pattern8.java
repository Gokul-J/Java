/*
Input : 5
Pattern:
1
2 3
6 5 4
7 8 9 10
15 14 13 12 11
*/

import java.util.Scanner;

public class pattern8{
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.close();

        int i,j,c,x=0;
        for(i=1;i<=n;i++){
            x=x+i;
            for(j=1;j<=i;j++){
                c=(i%2==1)?x-j+1:x+j-1;
                System.out.print(c+" ");
            }
            System.out.println("");
        }
        
        /*int temp=1,j=1,i;
        while(temp<=n){
            for(i=0;i<temp;i++){
                if(temp%2==0|temp==1){
                    System.out.print(j+" ");
                    j++;
                }
                else{
                    int temp1=temp+j-1;
                    for(i=0;i<temp;i++){
                        System.out.print(temp1+" ");
                        temp1--;
                        j++;
                    }
                }
            }
            temp++;
            System.out.println("");
        }*/
    }
}
