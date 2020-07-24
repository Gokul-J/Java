/*
Input : 4
Pattern:
1 1 1 1 1 1 1
1 2 2 2 2 2 1
1 2 3 3 3 2 1
1 2 3 4 3 2 1
1 2 3 3 3 2 1
1 2 2 2 2 2 1
1 1 1 1 1 1 1
*/

import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args){
        System.out.print("Enter the Input Number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        for(int i=-num+1;i<num;i++){
            for(int j=-num+1;j<num;j++){
                if(Math.abs(i)>=Math.abs(j)){
                    System.out.print(num-Math.abs(i)+" ");
                }
                else{
                    System.out.print(num-Math.abs(j)+" ");
                }
            }
            System.out.println("");
        } 
    }
}