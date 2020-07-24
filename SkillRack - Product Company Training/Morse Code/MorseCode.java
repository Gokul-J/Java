
/*
Input:
111 1 11111111111111
1111111111111111111111111 111111111111111 111111111111111111111
11111111 11111 1 111111111111111111
1111111111111 11111
Output:
can you hear me
Explanation:
The word "can" is formed from the morse code 111 1 11111111111111
111 represents c
1 represents a
11111111111111 represents n
The word "you" is formed from the morse code 1111111111111111111111111 111111111111111 111111111111111111111
1111111111111111111111111 represents y
111111111111111 represents o
111111111111111111111 represents u
The word "hear" is formed from the morse code 11111111 11111 1 111111111111111111
11111111 represents h
11111 represents e
1 represents a
111111111111111111 represents r
The word "me" is formed from the morse code 1111111111111 11111
1111111111111 represents m
11111 represents e
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Hello1 {

	public static void main(String[] args) throws FileNotFoundException {
		//Your Code Here
		Scanner sc=new Scanner(new File("/home/kali/Desktop/New Folder/text.txt"));
		while(sc.hasNextLine()){
		    String[] s=sc.nextLine().split(" ");
		    for(int i=0;i<s.length;i++){
                int n=s[i].length();
                char c=(char)('a'+n-1);
		        System.out.print(c);
		    }
		    System.out.print(" ");
		}

	}
}