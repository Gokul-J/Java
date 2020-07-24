import java.util.Scanner;
public class code7 {
    public static void main(String[] args){
        System.out.print("Enter the no. of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int var=0;
        for(int i=0;i<n;i++){
            int sum=arr[i];
            for(int j=i+2;j<n;j+=2){
                sum+=arr[j];
            }
            if(sum>var){
                var=sum;
            }
        }
        System.out.println(var);
    }
}