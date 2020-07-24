import java.util.Scanner;
public class code8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Left Arrow :");
        for(int i=-n;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || (Math.abs(i)%2==0 && j==n-Math.abs(i))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Right Arrow :");
        for(int i=-n;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || (Math.abs(i)%2==0 && j==Math.abs(i))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}