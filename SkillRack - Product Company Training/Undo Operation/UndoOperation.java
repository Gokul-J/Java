/*
Input:
3
Hey ^ goooo^^glee^
lucke^y ^charr^ms
ora^^nge^^^^

Output:
Hey google
luckycharms
-1

Input:
2
batt^le^^
eu^^^^ropes^

Output:
bat
rope
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class UndoOperation {

    public static void main(String[] args) throws FileNotFoundException {
		//Your Code Here
		Scanner sc=new Scanner(new File("/home/kali/Desktop/Product Company Training - SkillRack/Undo Operation/Text.txt"));
        int n=sc.nextInt();
		String[] str=new String[n+1];
		for(int i=0;i<=n;i++){
		    str[i]=sc.nextLine();
		}
		for(int j=1;j<=n;j++){
		    ArrayList<Character> ch=new ArrayList<>();
		    String s1=str[j];
		    char[] s=s1.toCharArray();
		    /*for(char c:s){
		        System.out.print(c);
		    }*/
		    for(int i=0;i<s.length;i++){
		        if(s[i]!='^'){
		            ch.add(s[i]);
		        }
		        else{
                    if(ch.size()>0){
                        ch.remove(ch.size()-1);
                    }
		        }
            }
            if(ch.size()==0){
                System.out.print(-1);
            }
		    for(Character c:ch){
		        System.out.print(c);
		    }
		    System.out.println();
		}

	}
}