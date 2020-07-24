import java.util.Scanner;
class oe{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int i=1;
        int x=a,y=b;
        while(i>0){
            while(i>0){
                if(a%2!=0){
                    System.out.print(a+" ");
                    a+=2;
                    break;
                }
                else{
                    a++;
                }
            }
            while(i>0){
                if(b%2==0){
                    System.out.print(b+" ");
                    b-=2;
                    break;
                }
                else{
                    b--;
                }
            }
            if(a>y || b<x){
                break;
            }
            i++;
        }
    }
}