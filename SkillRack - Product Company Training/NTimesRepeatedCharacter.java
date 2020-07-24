/*
Program prints last character repeated n times...
input:
skillrack
2
output:
k
*/

import java.util.*;
public class NTimesRepeatedCharacter {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		char[] s=sc.next().toCharArray();
		int n=sc.nextInt();
		char c='\0';
		for(int i=s.length-1;i>=0;i--){
		    int count=1;
		    for(int j=0;j<s.length;j++){
		        if(s[i]==s[j] && i!=j){
		            count++;
		        }
		        if(count>n){
		            break;
		        }
		    }
		    if(count==n){
		        c=s[i];
		        break;
		    }
		}
		if(c=='\0'){
		    System.out.println(-1);
		}
		else{
            System.out.println(c);
		}
	}
}