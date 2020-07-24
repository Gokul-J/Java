import java.util.*;
public class Main {
    public static void main(String[] args){
        
        List<Employee> employeelist = new ArrayList<>();
        employeelist.add(new Employee("Jane","Jones",123));
        employeelist.add(new Employee("John","Doe",4567));
        employeelist.add(new Employee("Mary","Smith",22));
        employeelist.add(new Employee("Mike","Wilson",3245));

        employeelist.forEach(Employee->System.out.println(Employee));
        
    }
}