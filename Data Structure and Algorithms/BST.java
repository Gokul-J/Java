import java.util.TreeMap;

public class BST {
    public static void main(String[] args){

        TreeMap<Integer,Integer> intTree=new TreeMap<>();

        intTree.put(25,25);
        intTree.put(25,20);
        intTree.put(15,15);
        intTree.put(27,27);
        intTree.put(30,30);
        intTree.put(29,29);
        intTree.put(26,26);
        intTree.put(22,22);
        intTree.put(32,32);
        
        System.out.println(intTree.values());
        System.out.println(intTree.size());

        System.out.println(intTree.get(27));

    }
    
}