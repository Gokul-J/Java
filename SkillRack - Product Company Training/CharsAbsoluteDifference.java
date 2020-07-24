/*
Input: abcdxyza bcdxmnomm 
Output: 2 
Explanation: 
Common characters are bcdx and the count is 4. 
Uncommon characters are ayzmno and the count is 6. 
Hence difference is 4-6 = -2. 
But as absolute difference is asked, the output is 2.
*/
import java.util.*;
class CharsAbsoluteDifference {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		char[] s1=sc.next().toCharArray();
		char[] s2=sc.next().toCharArray();
		int[] count=new int[26];
		int common=0,uncommon=0;
		for(int i=0;i<s1.length;i++){
		    int index=s1[i]-'a';
		    count[index]=1;
		}
		for(int i=0;i<s2.length;i++){
		    int index=s2[i]-'a';
		    if(count[index]==1 || count[index]==-1){
		        count[index]=-1;
		    }
		    else{
		        count[index]=2;
		    }
		}
		for(int i=0;i<count.length;i++){
		    if(count[i]==1 || count[i]==2){
		        uncommon++;
		    }
		    else if(count[i]==-1){
		        common++;
		    }
		}
		System.out.print(Math.abs(common-uncommon));
	}
}