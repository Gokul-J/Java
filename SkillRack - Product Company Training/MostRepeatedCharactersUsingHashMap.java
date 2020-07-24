/*
Input: #XRREETRE 
Output: RREERE
*/
import java.util.*;
class MostRepeatedCharacters {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		char[] ch=sc.next().toCharArray();
		sc.close();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		int large=0;
		for(char i:ch){
		    Integer c=hm.get(i);
		    if(c==null){
		        c=1;
		    }
		    else{
		        c+=1;
		    }
		    if(c>large){
		        large=c;
		    }
		    hm.put(i,c);
		}
		for(char i:ch){
		    for(Map.Entry<Character,Integer> t:hm.entrySet()){
		        if(t.getValue()==Integer.valueOf(large) && t.getKey()==Character.valueOf(i)){
		            System.out.print(i);
		        }
		    }
		}
	}
}