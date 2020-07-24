public class Main {
    public static void main(String[] args){

        Employee janeJones=new Employee("Jane","Jones",123);
        Employee johnDoe=new Employee("John","Doe",4567);
        Employee marySmith=new Employee("Mary","Smith",22);
        Employee mikeWilson=new Employee("Mike","Wilson",3245);

        LinearProbedHashTable ht=new LinearProbedHashTable();

        ht.put("Jones",janeJones);
        ht.put("Doe",johnDoe);
        ht.put("Wilson",mikeWilson);
        ht.put("Smith",marySmith);

        ht.printhashtable();
        System.out.println();

        System.out.print(ht.get("Smith"));

        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printhashtable();

        System.out.print(ht.get("Smith"));

    }
    
}