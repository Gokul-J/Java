import java.util.Scanner;
public class code1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Solid Rectangle :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Hollow Rectangle :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1){
                    System.out.print("* ");
                }
                else if(j==0 || j==m-1){
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