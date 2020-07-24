import java.util.*;

public class code1{
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public static void main(String[] args){
        code1 c1=new code1();
        System.out.print("Enter the number of Array elements : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter Array Elements : ");
        for(int i=0;i<n;i++){
            c1.arr.add(sc.nextInt());
        }
        System.out.print("Array Elements : ");
        c1.print();
        System.out.println();
        System.out.print("Enter the number of queries : ");
        int times = sc.nextInt();
        System.out.println("Select Query : \n 'A'-append \n 'D'-remove all occurences \n 'S'-get last position \n followed by value");
        for(int i=0;i<times;i++){
            System.out.print("Enter query : ");
            char c=sc.next().toUpperCase().charAt(0);
            int v=sc.nextInt();
            switch(c){
            case 'A':
                c1.append(v);
                break;
            case 'S':
                c1.search(v);
                break;
            case 'D':
                c1.remove(v);
                break;
            default :
                System.out.println("UNDEFINED QUERY");
            }
        }
    }

    public void print(){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public void append(int v){
        arr.add(v);
        print();
    }

    public void search(int v){
        if(arr.contains(v)){
            System.out.println(arr.lastIndexOf(v));
        }
        else{
            System.out.println("Not Available");
        }
    }

    public void remove(int v){
        arr.removeAll(Arrays.asList(v));
        print();
    }
}