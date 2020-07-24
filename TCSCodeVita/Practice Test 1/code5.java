import java.util.Scanner;
public class code5 {
    public static void main(String[] args){
        System.out.print("Enter the no. of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int limit=n/2;
        boolean done=false;
        for(int i=0;i<n;i++){
            int counter=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    counter++;
                }
            }
            if(counter>limit){
                done=true;
                System.out.println(arr[i]);
            }
        }
        if(!done){
            System.out.println("NO");
        }
    }
}