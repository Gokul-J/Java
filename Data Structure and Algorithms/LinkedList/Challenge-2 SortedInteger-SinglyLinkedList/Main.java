public class Main {
    public static void main(String[] args){
        
        IntLinkedList list=new IntLinkedList();
        list.insertSorted(4);
        list.insertSorted(2);
        list.insertSorted(1);
        list.insertSorted(5);

        list.printlist();
    }
}
