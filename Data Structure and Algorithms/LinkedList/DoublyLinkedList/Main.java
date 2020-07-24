public class Main {
    public static void main(String[] args){
        
        Employee janeJones=new Employee("Jane","Jones",123);
        Employee johnDoe=new Employee("John","Doe",4567);
        Employee marySmith=new Employee("Mary","Smith",22);
        Employee mikeWilson=new Employee("Mike","Wilson",3245);
        Employee jamesBond=new Employee("James","Bond",007);

        EmployeeDoublyLinkedList list=new EmployeeDoublyLinkedList();

        list.removeFromFront();
        list.printlist();
        System.out.println(list.getSize());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        
        /*list.printlist();
        System.out.println(list.getSize());

        Employee billend=new Employee("Bill", "End", 78);
        list.addToEnd(billend);

        list.printlist();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printlist();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printlist();
        System.out.println(list.getSize());
        */
        list.printlist();
        System.out.println(list.getSize());
        System.out.println(list.addBefore(jamesBond, johnDoe));
        list.printlist();
        System.out.println(list.getSize());


    }
}