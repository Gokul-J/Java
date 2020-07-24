public class EmployeeDoublyLinkedList{

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

        if(head==null){
            tail=node;
        }
        else{
            node.setNext(head);
            head.setPrevious(node);
        }
        head=node;
        size++;
    }

    public boolean addBefore(Employee newEmployee,Employee existingEmployee){
        if(isEmpty()){
            return false;
        }
        EmployeeNode node=new EmployeeNode(newEmployee);
        EmployeeNode current=head;
        while(current!=null && !current.getEmployee().equals(existingEmployee)){
            current=current.getNext();
        }

        if(current==null){
            return false;
        }
        
        node.setNext(current);
        node.setPrevious(current.getPrevious());
        current.setPrevious(node);

        if(head==current){
            head=node;
        }
        else{
            node.getPrevious().setNext(node);
        }
        size++;
        return true;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

        if(tail==null){
            head=node;
        }
        else{
            node.setPrevious(tail);
            tail.setNext(node);
        }
        tail=node;
        size++;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode removednode=head;

        if(head.getNext()==null){
            tail=null;
        }
        else{
            head.getNext().setPrevious(null);
        }
        head=head.getNext();
        size--;
        removednode.setNext(null);
        return removednode;
    }

    public EmployeeNode removeFromEnd(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode removedNode=tail;

        if(tail.getPrevious()==null){
            head=null;
        }
        else{
            tail.getPrevious().setNext(null);
        }
        tail=tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void printlist(){
        EmployeeNode current=head;
        if(current!=null){
            System.out.print("HEAD->");
            while(current!=null){
                System.out.print(current);
                System.out.print("<=>");
                current=current.getNext();
            }
            System.out.println("null");
        }
        else{
            System.out.println("Empty List");
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}