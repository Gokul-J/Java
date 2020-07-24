/*
Input : 4
Pattern:
1
1 1
1   1
1 1 1 1
*/
import java.util.Scanner;

class pattern18{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n-1){
                    System.out.print(1+" ");
                }
                else if(j==0 || j==i){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}