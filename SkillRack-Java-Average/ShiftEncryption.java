import java.util.*;
class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int x=sc.nextInt();
		int y=sc.nextInt();
		String e="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='z'){
                char c='a';
                e+=(c+=x-1);
            }
            else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                char c=s.charAt(i);
                e+=(c+=x);
            }
            else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                char c=s.charAt(i);
                int n=Integer.parseInt(String.valueOf(c))+y;
                e+=String.valueOf(n);
            }
            else{
                e+=s.charAt(i);
            }
        }
        System.out.print(e);
	}
}