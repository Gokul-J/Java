/* prime number pyramid up to N lines....
1,2,3,5,7,11,13,17,...

Input : 4
Output:
          *
         * *
        * * *
      * * * * *
    * * * * * * *
* * * * * * * * * * *
*/
import java.util.Scanner;

class pnPyramid {
    int i=0;
    int prime(){

        while(i>=0){
            boolean c = true;
            i++;
            for(int j=2;j<i;j++){
                if(i%2==0 | i%j == 0){
                    c=false;
                    break;
                }
            }
            if(c==true){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        System.out.print("Enter a Number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        pnPyramid p = new pnPyramid();

        int k,j;
        int[] pno = new int[n];
        for(k=0;k<n;k++){
                pno[k] = p.prime();
        }
        /*for(k=0;k<n;k++){
            System.out.print(pno[k]);
            System.out.println();
        }*/
        int high = pno[n-1];
        //System.out.println(high);
        for(k=0;k<pno.length;k++){
            for(j=0;j<high-pno[k];j++){
                System.out.print(" ");
            }
            for(j=0;j<pno[k];j++){
            System.out.print("* ");}
            System.out.println();
        }
    }
}