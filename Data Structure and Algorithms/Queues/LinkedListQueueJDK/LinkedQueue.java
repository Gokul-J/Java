import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedQueue {

    private LinkedList<Employee> stack;

    public LinkedQueue(){
        stack=new LinkedList<>();
    }

    public void add(Employee employee){
        stack.add(employee);
    }

    public Employee remove(){
        return stack.remove();
    }

    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void size(){
        System.out.println(stack.size());
    }

    public void printQueue(){
        ListIterator<Employee> iter=stack.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    
}