import java.util.Scanner;
public class code3 {
    public static void main(String[] args){
        System.out.print("Enter the no. of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter array elements : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean head=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    head=true;
                }
                else{
                    head=false;
                    break;
                }
                if(i==n-1){
                    head=true;
                }
            }
            if(head){
                System.out.print(arr[i]+" ");
            }
        }
    }
}