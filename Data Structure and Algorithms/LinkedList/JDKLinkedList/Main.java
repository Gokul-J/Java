import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        
        Employee janeJones=new Employee("Jane","Jones",123);
        Employee johnDoe=new Employee("John","Doe",4567);
        Employee marySmith=new Employee("Mary","Smith",22);
        Employee mikeWilson=new Employee("Mike","Wilson",3245);
        Employee billEnd=new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        printList(list);

        list.add(billEnd);
        //list.add(index, element);
        //list.addLast(e);
        printList(list);

        list.removeFirst();
        //list.remove();
        printList(list);

        list.removeLast();
        printList(list);

        /*Print using for....
        for(Employee employee :list){
            System.out.print(employee);
        }*/

    }

    public static void printList(LinkedList<Employee> list){
        Iterator<Employee> iter=list.iterator();
        System.out.print("\nHEAD->");
        while(iter.hasNext()){
            System.out.print(iter.next()+"<=>");
        }
        System.out.println("null");
    }
}

        