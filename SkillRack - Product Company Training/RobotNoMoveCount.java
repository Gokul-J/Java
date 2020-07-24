/*
Robot No Movement Count...

Input :
10 10
12
5F 8L 4F 8B 10R 6F 8B 7L 4R 3L 2L 5F
Ouput:
3

Input:
52 44
17
12R 19F 17B 13B 12R 20L 2R 19R 5L 6F 6B 8B 6B 9F 16L 11R 20B
Output:
4
*/

import java.util.*;
public class RobotNoMoveCount {
    
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		String[] cmd=new String[n];
		for(int i=0;i<n;i++){
		    cmd[i]=sc.next();
		}
		int x=0;
		int y=0;
		int count=0;
		for(int i=0;i<n;i++){
		    String s=cmd[i];
		    int n1=-1;
		    char c='\0';
		    for(int j=0;j<s.length();j++){
		        if(Character.isAlphabetic(s.charAt(j))){
		            n1=Integer.valueOf(s.substring(0,j));
		            c=s.charAt(j);
		        }
		    }
            if (c == 'R') {
                if (x + n1 <= l) {
                    x += n1;
                } 
                else {
                    count++;
                }
            } 
            else if (c == 'L') {
                if (x - n1 >=0) {
                    x -= n1;
                } 
                else {
                    count++;
                }
            } 
            else if (c == 'F') {
                if (y + n1 <= b) {
                    y += n1;
                } 
                else {
                    count++;
                }
            } 
            else if (c == 'B') {
                if (y - n1 > 0) {
                    y -= n1;
                } 
                else {
                    count++;
                }
            }
		}
		System.out.print(count);
	}
}