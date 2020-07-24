/*
Digital Root
input : 12345
output : 1+2+3+4+5=15=1+5=6
6<- print only this
*/

import java.util.Scanner;
import java.util.ArrayList;



class digitalRoot{
    private ArrayList<Integer> out = new ArrayList<Integer>();
    private int sum;
    int digits(int n){
        int i=0,temp;
        sum=0;
        out.clear();
        while(i>=0){
            temp=n/10;
            out.add(n%10);
            n=temp;
            i++;
            if(n==0){break;}
        }
        for(int element : out){
            sum+=element;
        }
        if(sum>9){
            digits(sum);
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        digitalRoot d = new digitalRoot();
        d.digits(n);
        System.out.print(d.sum);
    }
}