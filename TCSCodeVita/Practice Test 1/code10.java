import java.util.Scanner;
public class code10 {
    public static void main(String[] args){
        System.out.print("Enter the no. of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean exist=true;
        for(int i=1;i<=n+1;i++){
            for(int j : arr){
                if(j==i){
                    exist=true;
                    break;
                }
                else{
                    exist=false;
                }
            }
            if(!exist){
                System.out.print(i+" ");
                exist=true;
            }
        }
    }
}