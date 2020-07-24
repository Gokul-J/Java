//Program to print a Stair Case...

import java.util.Scanner;

public class stairCase{

    void upStairs(int n){
        for(int i=0;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            if(i==0){
                System.out.println("__");
                continue;
            }
            System.out.println("__|");
        }
    }

    void downStairs(int n){
        System.out.println(" __");
        for(int i=0;i<n;i++){
            
            for(int j=n-1;j<n+i;j++){
                System.out.print("  ");
            }
            System.out.println("|__");
        }
    }
    public static void main(String[] args){
        System.out.print("Enter the no. of Stairs to build : ");
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        stairCase s = new stairCase();
        System.out.println("What type of Stair do you want to build?\nSelect one:\n 1. Up Stairs\n 2. Down Stairs");
        System.out.print("Enter your option : ");
        Scanner in1=new Scanner(System.in);
        int c = in1.nextInt();
        //only close Scanner after all Scanner operations are done
        in.close();
        in1.close();
        if(c==1){
            s.upStairs(n);
        }
        else if(c==2){
            s.downStairs(n);
        }
        else{
            System.out.println("Invalid Input");
        }
        System.out.println("\nStairs Build Successfully...");
    }
}