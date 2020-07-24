/*
N positive values v(i) where i = 1 to N are passed as input to the program. The program must print the count C of the integer
values which are powers of X.
Boundary Condition(s):
1 <= N <= 10^6
1 <= v(i) <= 10^18
Input Format:
The first line contains N and X separated by a space.
The second line contains N values separated by space.
Output Format:
The first line contains C
Example Input/Output 1:
Input:
9 5
25 15 125 35 625 380625 152587890625 10 90
Output:
4
Example Input/Output 2:
Input:
7 2
1 2 4 8 16 20 32
Output:
6
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++){
		    long num=sc.nextLong();
		    int num1=(int)(Math.floor((Math.log(num)/Math.log(k))));
		    if(Math.pow(k,num1)==num){
		        count++;
		    }
		}
		System.out.println(count);
	}
}