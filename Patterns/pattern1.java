/*
Input : 7
Pattern:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
*/

import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args){
        System.out.print("Enter the Input Number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        if(num<=0){
            System.out.println("Invalid Input");
        }
        int times = 0;
        while(times<=num){
            for(int i=1;i<=times;i++){
                System.out.print(i+" ");
            } 
            System.out.println();
            times++;
        }        
    }
}