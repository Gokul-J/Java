public class Main {
    public static void main(String[] args){

        Employee janeJones=new Employee("Jane","Jones",123);
        Employee johnDoe=new Employee("John","Doe",4567);
        Employee marySmith=new Employee("Mary","Smith",22);
        Employee mikeWilson=new Employee("Mike","Wilson",3245);

        SimpleHashTable ht=new SimpleHashTable();

        //System.out.println(stack.pop());

        ht.put("Jones",janeJones);
        ht.put("Doe",johnDoe);
        ht.put("Smith",marySmith);
        ht.put("Wilson",mikeWilson);

        ht.printhashtable();
        System.out.println();

        System.out.print(ht.get("Jones"));
    }
    
}