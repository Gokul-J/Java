/*
Input : 5 +
Output:
1 + 2 + 3 + 4 + 5 
 4 + 3 + 2 + 1 
  1 + 2 + 3 
   2 + 1 
    1 
*/
import java.util.*;
public class pattern19 {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char c=sc.next().charAt(0);
		sc.close();
		int p1=n-1;
		int count=1;
		for(int i=n;i>=1;i--){
		    for(int j=n;j>=i;j--){
		        System.out.print(" ");
		    }
		    if(count%2!=0){
		        for(int j=1;j<=i;j++){
		            System.out.print(j+" ");
		            if(j!=i){
		                System.out.print(c+" ");
		            }
		        }
		    }
		    else{
		        int p2=p1;
		        for(int j=1;j<=i;j++){
		            System.out.print(p2+" ");
		            if(j!=i){
		                System.out.print(c+" ");
		            }
		            p2--;
		        }
		        p1-=2;
		    }
		    count++;
		    System.out.println();
		}

	}
}