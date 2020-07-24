/*
Example Input/Output 1:
Input:
missel^z^z^z^ypell^z^z^yt
Output:
misspelt
Explanation:
The characters missel are followed by three undo operations which deletes last three characters.
So the string missel becomes mis.
The three undo operations are followed by one redo operation which reverses the last undo operation.
So the string mis becomes miss.
Then the characters pell are entered which are followed by two undo operations so the last two characters are removed.
So the string becomes misspe.
Then a redo operation is applied which reverses the last undo operation and so the string misspe becomes misspel.
The characters are followed by t so the final string is misspelt.

Example input/output 2:
Input:
q^z^zthere^z^y^yyou
Output:
thereyou
*/import java.util.*;
class UndoAndRedo {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		char[] s=sc.next().toCharArray();
        ArrayList<Character> ch=new ArrayList<>();
        ArrayList<Character> deleted=new ArrayList<>();
        for(int i=0;i<s.length;i++){
            if(s[i]=='^'){
                if(s[i+1]=='z' && !ch.isEmpty()){
                    deleted.add(ch.get(ch.size()-1));
                    ch.remove(ch.size()-1);
                }
                if(s[i+1]=='y' && !deleted.isEmpty()){
                    ch.add(deleted.get(deleted.size()-1));
                    deleted.remove(deleted.size()-1);
                }
                i++;
            }
            else{
                deleted.clear();
                ch.add(s[i]);
            }
        }
        for(Character i:ch){
            System.out.print(i);
        }
	}
}