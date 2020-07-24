import java.util.Scanner;

public class Factorial {

    public static long fact(long n){
        if(n==1||n==0){
            return 1;
        }
        //else{
            return n*fact(n-1);
        //}
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        sc.close();
        System.out.print(fact(n));
    }
    
}