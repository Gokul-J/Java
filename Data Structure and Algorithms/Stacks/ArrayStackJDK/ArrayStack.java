import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayStack {

    private ArrayDeque<Employee> stack;

    public ArrayStack(int capacity){
        stack=new ArrayDeque<Employee>() ;
    }

    public void push(Employee employee){
        stack.push(employee);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public void size(){
        System.out.println(stack.size());
    }

    public void printStack(){
        Iterator<Employee> iter=stack.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
    }
    
}