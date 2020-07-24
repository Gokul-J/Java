public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head=node;
        size++;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode removednode=head;
        head=head.getNext();
        size--;
        removednode.setNext(null);
        return removednode;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void printlist(){
        EmployeeNode current=head;
        System.out.print("HEAD->");
        while(current!=null){
            System.out.print(current);
            System.out.print("->");
            current=current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}