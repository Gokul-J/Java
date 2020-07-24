import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        queue=new Employee[capacity];
    }

    public void add(Employee employee){
        if(size()==queue.length){
            Employee[] newqueue=new Employee[2*queue.length];
            System.arraycopy(queue, 0, newqueue, 0, queue.length);
            queue=newqueue;
        }
        queue[back++]=employee;
    }

    public Employee remove(){
        if(size()==0){
            throw new NoSuchElementException("No Elements in queue");
        }
        
        Employee employee=queue[front];
        queue[front++]=null;

        if(size()==0){
            front=0;
            back=0;
        }
        return employee;
    }

    public Employee peek(){
        if(size()==0){
            throw new NoSuchElementException("No Elements in queue");
        }

        return queue[front];
    }

    public int size(){
        return back-front;
    }

    public void printQueue(){
        for(int i=front;i<back;i++){
            System.out.println(queue[i]);
        }
    }
}