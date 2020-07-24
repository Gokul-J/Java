import java.util.NoSuchElementException;

public class ArrayCircularQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayCircularQueue(int capacity){
        queue=new Employee[capacity];
    }

    public void add(Employee employee){
        if(size()==queue.length-1){
            Employee[] newqueue=new Employee[2*queue.length];
            int numitems=size();
            System.arraycopy(queue, front, newqueue, 0, queue.length-front);
            System.arraycopy(queue, 0, newqueue, queue.length-front, back);
            queue=newqueue;
            front=0;
            back=numitems;
        }

        queue[back]=employee;
        if(back<queue.length-1){
            back++;
        }
        else{
            back=0;
        }
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
        else if(front==queue.length){
            front=0;
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
        if(front<=back){
            return back-front;
        }
        else{
            return back-front+queue.length;
        }
    }

    public void printQueue(){
        if(front<=back){
            for(int i=front;i<back;i++){
                System.out.println(queue[i]);
            }
        }
        else{
            for(int i=front;i<queue.length;i++){
                System.out.println(queue[i]);
            }
            for(int i=0;i<back;i++){
                System.out.println(queue[i]);
            }
        }
    }
}