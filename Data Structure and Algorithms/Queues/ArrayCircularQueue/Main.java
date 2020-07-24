public class Main {
    public static void main(String[] args){

        Employee janeJones=new Employee("Jane","Jones",123);
        Employee johnDoe=new Employee("John","Doe",4567);
        Employee marySmith=new Employee("Mary","Smith",22);
        Employee mikeWilson=new Employee("Mike","Wilson",3245);

        ArrayCircularQueue queue=new ArrayCircularQueue(4);

        queue.add(janeJones);
        queue.add(johnDoe);
        queue.remove();
        queue.add(marySmith);
        queue.remove();
        queue.add(mikeWilson);
        queue.remove();
        queue.add(janeJones);

        System.out.println(queue.size());

        queue.printQueue();





        /*queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);

        queue.printQueue();
        System.out.println(queue.size());
        System.out.println();
        System.out.println("PEEKED: "+queue.peek()+"\n");

        queue.remove();
                
        queue.printQueue();

        System.out.println(queue.size());*/
    }
    
}