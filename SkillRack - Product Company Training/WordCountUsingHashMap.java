/*
Count the no. of occurence of word using HashMap...
Input:
one two three four three two five one five Three
2
Output:
4
*/
import java.util.*;
class wordCount {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String[] words=sc.nextLine().split(" ");
        int n=sc.nextInt();
        sc.close();
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        for(String i:words){
            Integer c=hm.get(i);
            hm.put(i,c==null?1:c+1);
        }
        int count=0;
        for(Map.Entry<String,Integer> e:hm.entrySet()){
            if(e.getValue()==Integer.valueOf(n)){
                count++;
            }
        }
        System.out.print(count);
	}
}