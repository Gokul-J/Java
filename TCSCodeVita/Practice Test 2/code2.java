import java.util.Scanner;
public class code2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Half Pyramid :");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Inverted Full Pyramid :");
        for(int i=n;i>0;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Hollow Full Pyramid :");
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                if(i==1 || i==n){
                    System.out.print("* ");
                }
                else if(j==i || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}