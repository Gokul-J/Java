import java.util.Scanner;

class task{
    public static void main(String[] args){
        System.out.print("Enter the Encoded String : ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();

        char[] ch = new char[s.length()];
        s.getChars(0, s.length(), ch, 0);
        /*for(char i : ch){
            System.out.print(i+" ");
        }*/
        int l=ch.length;
        int i=0;
        while(i<l){
            char c = ch[i];
            int j=0;
            while(c==ch[i]){
                i++;
                j++;
                if(i==l){
                    break;
                }
            }
            System.out.print(c+""+j);
        }
    }
}