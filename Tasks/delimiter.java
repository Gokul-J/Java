//using delimiter to remove all special char from a string...
import java.util.*;
public class delimiter {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("[^a-zA-Z0-9]+");
		while(sc.hasNext()){
		    System.out.print(sc.next());
		}
		sc.close();
	}
}