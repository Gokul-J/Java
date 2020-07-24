import java.util.Arrays;
import java.util.Scanner;
public class code2 {
    public static void main(String[] args){
        System.out.print("Enter the num of elements : ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

}