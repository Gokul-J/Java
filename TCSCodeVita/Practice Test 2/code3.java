import java.util.Scanner;
public class code3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<2*n-i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i*2;j++){
                if(j%2==0){
                    System.out.print(i);
                }
                else{
                    System.out.print("*");
                }
            }
            for(int j=0;j<2*n-i-2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}