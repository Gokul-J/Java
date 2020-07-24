//Program to reverse a string word wise
//input : I like your task
//output : task your like I

import java.util.Scanner;

class reverseAString {
	public static void main(String[] args){
		System.out.print("Enter the String : ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		String[] words = str.split(" ");
		int len=words.length;
		for(int i=len-1;i>=0;i--){
			System.out.print(words[i]+" ");
		}
	}
}