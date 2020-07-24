import java.util.*;
class Hello {
    int count=0;
    int palindrome(String s){
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        if(s.equals(r)){
            count++;
        }
        //return count;
        return count;
    }
    public static void main(String[] args) {
		//Your Code Here
		Hello n=new Hello();
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //n.palindrome(s);
		for(int i=0;i<s.length()-2;i++){
		    for(int j=i+2;j<s.length();j++){
		        n.palindrome(s.substring(i,j+1));
		    }
		}
        System.out.print(n.count);
	}
}