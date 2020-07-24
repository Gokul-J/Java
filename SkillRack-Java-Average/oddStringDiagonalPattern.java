import java.util.*;   
class PalindromeExample2  
{  
   public static void main(String args[])  
   {  
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
     int len=s.length();
     for(int i=0;i<len;i++){
        /*if(i<len/2){
           for(int j=0;j<len;j++){
              if(j==i||j==len-i-1){
                 System.out.print(s.charAt(j));
              }
              else{
                 System.out.print(" ");
              }
           }
        }*/
        if(i==len/2){
           for(int j=0;j<len/2;j++){
              System.out.print(" ");
           }
           System.out.print(s.charAt(i));
        }
        else{
           for(int j=0;j<len;j++){
              if(j==i||j==len-i-1){
                 System.out.print(s.charAt(j));
              }
              else{
                 System.out.print(" ");
              }
           }
        }
        System.out.println();
     }
   }  
}  