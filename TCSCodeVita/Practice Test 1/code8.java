import java.util.Scanner;
public class code8 {
    public static void main(String[] args){
        System.out.print("Enter the no. of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the rotate unit : ");
        int x=sc.nextInt();
        for(int i=x;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=x-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}