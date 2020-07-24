import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        //true
        System.out.println(checkForPalindrome("abccba"));
        //true
        System.out.println(checkForPalindrome("Was it a car or a cat i saw?"));
        //true
        System.out.println(checkForPalindrome("I did, did I?"));
        //false
        System.out.println(checkForPalindrome("hello"));
        //true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string){

        LinkedList<Character> queue=new LinkedList<Character>();
        string=string.toLowerCase();
        StringBuilder stringNoPunc=new StringBuilder(string.length());

        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>='a' && string.charAt(i)<='z'){
                stringNoPunc.append(string.charAt(i));
                queue.add(string.charAt(i));
            }
        }
        StringBuilder reversedString = new StringBuilder(queue.size());
        while(!queue.isEmpty()){
            reversedString.append(queue.remove());
        }
        reversedString.reverse();
        return reversedString.toString().equals(stringNoPunc.toString());
    }
}