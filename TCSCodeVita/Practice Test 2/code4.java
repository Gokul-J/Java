import java.util.Scanner;
public class code4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Solid Diamond :");
        for(int i=n;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Hollow Diamond :");
        for(int i=n;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                if(j==i || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>i;j--){
                if(j==i+1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Solid Half Diamond :");
        for(int i=n;i>0;i--){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=n-1;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}