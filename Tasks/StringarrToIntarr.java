import java.util.*;
class test6 {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		//teamA
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		//int len=s1.length()/2;
		sc.close();
		
		String[] sa=s1.split(" ");
        String[] sb=s2.split(" ");
        int[] a=Arrays.stream(sa).mapToInt(Integer::parseInt).toArray();
		int[] b=Arrays.stream(sb).mapToInt(Integer::parseInt).toArray();
		int ap=0,bp=0;
		for(int i=0;i<a.length;i++){
		    if(a[i]==b[i]){
		        ap++;
		        bp++;
		    }
		    else if(a[i]>b[i]){
		        ap+=3;
		    }
		    else{
		        bp+=3;
		    }
		}
		System.out.print(ap+" "+bp);
	}
}