import java.util.Scanner;
public class code4 {
    public static void main(String[] args){
        System.out.print("Enter the no. of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the sum value : ");
        int x=sc.nextInt();
        boolean possible=false;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i+1;j<n;j++){
                sum=arr[i]+arr[j];
                if(sum==x){
                    System.out.print("YES");
                    possible=true;
                    break;
                }
            }
            if(possible){break;}
        }
        if(!possible){
            System.out.print("NO");
        }
    }
}