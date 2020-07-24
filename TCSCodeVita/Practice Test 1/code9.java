import java.util.Scanner;
public class code9 {
    public static void main(String[] args){
        System.out.print("Enter the no. of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number : ");
        int x=sc.nextInt();
    }
}