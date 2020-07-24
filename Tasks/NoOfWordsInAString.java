//Count no.of words in a string with 2 spaces...

import java.util.Scanner;

class wordsInString {
	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner s1=new Scanner(System.in);
		String a = s1.nextLine();
		s1.close();
		int count=0;
		String b[]=a.split(" ");
		count=b.length;
		System.out.println("The no. of words is "+count);
	}
}
