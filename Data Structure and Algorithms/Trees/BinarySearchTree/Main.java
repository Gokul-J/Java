public class Main {

    public static void main(String[] args){

        Tree intTree=new Tree();
        
        //Insertion...
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        //Traversal...
        System.out.println("Inorder Traversal :");
        intTree.inorder();
        System.out.println("\nPreorder Traversal :");
        intTree.preorder();
        System.out.println("\nPostorder Traversal :");
        intTree.postorder();

        //Get...
        System.out.println();
        System.out.println(intTree.get(27));
        System.out.println(intTree.get(15));
        System.out.println(intTree.get(8888));

        //Min...
        System.out.println(intTree.min());
        //Max...
        System.out.println(intTree.max());

        intTree.inorder();
        System.out.println();
        //intTree.delete(15);
        //intTree.delete(17);
        intTree.delete(25);
        intTree.inorder();
    }
    
}