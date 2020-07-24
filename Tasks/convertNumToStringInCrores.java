//Program to convert a number to a string in Crores format till 999 Crores...
//input : 123
//output : one twenty three

import java.util.Scanner;

class conversionInCrores{

    static String one[] = {"", "One ", "Two ", "Three ", "four ", 
            "Five ", "Six ", "Seven ", "Eight ", 
            "Nine ", "Ten ", "Eleven ", "Twelve ", 
            "Thirteen ", "Fourteen ", "Fifteen ", 
            "Sixteen ", "Seventeen ", "Eighteen ", 
            "Nineteen "
    };

    static String ten[] = {"", "", "Twenty ", "Thirty ", "Forty ", 
        "Fifty ", "Sixty ", "Seventy ", "Eighty ", 
        "Ninety "
    };

    static String hundred[] = {"","One Hundred ","Two Hundred ","Three Hundred ",
    "Four Hundred ","Five Hundred ","Six Hundred ", "Seven Hundred ","Eight Hundred ","Nine Hundred "};

    String numToString(long n,String s){
        String str="";
        //System.out.println(n);
        if(n>19 && n<100){
            str += ten[(int)n/10]+one[(int)n%10];  
        }
        else if(n>=100){
            str += hundred[(int)n/100]+ten[(int)(n/100)%10]+one[(int)n%10];
        }
        else{
            str = one[(int)n];
        }
        if(n!=0){
            str+=s+" ";
        }
        return str;

    }
    
    String convertToString(long n){
        String out="";
        if(n==0){
            out+="Zero";
        }
        if(n<0){
            return "Invalid Input";
        }
        //Crores place
        out+=numToString(((n/10000000)), "Crore");
        //Lakhs place
        out+=numToString(((n/100000)%100),"Lakhs");
        //Thousands place
        out+=numToString((((n/1000)%100)),"Thousand");
        //Hundreds place
        out+=numToString((((n/100)%10)),"Hundred and");
        //Tens place
        out+=numToString(n%100, "");
        return out;
    }
    public static void main(String[] args){
        System.out.print("Enter the number to convert : ");
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        s.close();

        conversionInCrores n = new conversionInCrores();
        System.out.print(n.convertToString(num));
    }
}