import java.util.Scanner;

public class primeNumber{

    void prime(int n){
        int i;
        for(i=2;i<=n;i++){
            boolean c = true;
            for(int j=2;j<i;j++){
                if(i%2==0 | i%j == 0){
                    //System.out.print(i+" ");
                    c=false;
                    break;
                }
            }
            if(c==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        System.out.print("Enter the number limit : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        primeNumber num = new primeNumber();
        num.prime(n);
            
    }
}