import java.util.*;
public class Encrypter {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int col=sc.nextInt();
		int row=s.length()/col;
		char[][] c=new char[row][col];
		for(int i=0;i<row;i++){
		    if(i%2==0){
		        for(int j=i*col;j<i*col+col;j++){
		            c[i][j%col]=s.charAt(j);
		        }
		    }
		    else{
		        int k=0;
		        for(int j=col*(i+1)-1;j>=col*i;j--){
		            c[i][k]=s.charAt(j);
		            k++;
		            
		        }
		    }
		}
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(c[j][i]);
            }
        }
        /*for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }*/
	}
}