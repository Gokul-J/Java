//Program to count the no. of vowels and consonants in a given string...

package tasks;
import java.util.Scanner;

class countvc{
    public static void main(String[] args){
        System.out.print("Enter the Stirng : ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();

        int vcount=0,ccount=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i'
            || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vcount++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                ccount++;
            }
        }
        System.out.println("No. of Vowels is "+vcount);
        System.out.println("No. of Consonants is "+ccount);
    }    
}