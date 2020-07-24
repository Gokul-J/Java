import java.util.*;
class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int len=s.length();
		int cu=0,cl=0,cn=0,cs=0;
		boolean valid=false;
		for(int i=0;i<len;i++){
		    if(len>=8&&len<=25){
		        if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
		            cu++;
		        }
		        else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
		            cl++;
		        }
		        else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
		            cn++;
		        }
		        else{
		            cs++;
                }
		        if(cu!=0&&cl!=0&&cn>1&&cs!=0){
		            valid=true;
		            break;
		        }
		    }
		    else{
		        break;
		    }
        }
		if(valid){
		    System.out.print("VALID");
		}
		else{
		    System.out.print("INVALID");
		}

	}
}