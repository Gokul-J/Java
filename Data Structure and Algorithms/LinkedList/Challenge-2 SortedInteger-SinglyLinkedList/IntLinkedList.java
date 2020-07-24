public class IntLinkedList {

    private IntNode head;
    private int size;

    public void insertSorted(int id){
        IntNode node=new IntNode(id);
        if(head==null){
            head=node;
        }
        else{
            IntNode current=head;
            IntNode previous=current;
            while(current!=null && current.getId()<node.getId()){
                previous=current;
                current=current.getNext();
            }
            if(previous==head){
                node.setNext(head);
                head=node;
            }
            else{
                node.setNext(previous.getNext());
                previous.setNext(node);
            }
        }
        size++;
    }
    public boolean isEmpty(){
        return head==null;
    }

    public void printlist(){
        IntNode current=head;
        System.out.print("HEAD->");
        while(current!=null){
            System.out.print(current.getId());
            System.out.print("->");
            current=current.getNext();
        }
        System.out.print("null");
        
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}