import java.util.LinkedList;
import java.util.HashMap;
import java.util.*;

public class Main{
    public static void main(String[] args){

        LinkedList<Employee> employees=new LinkedList<>();
        employees.add(new Employee("Jane","Jones",123));
        employees.add(new Employee("John","Doe",5678));
        employees.add(new Employee("Mike","Wilson",45));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill","End",3948));
        employees.add(new Employee("Jane","Jones",123));

        employees.forEach(e->System.out.println(e));
        System.out.println();

        HashMap<Integer,Employee> db=new HashMap<Integer,Employee>();
        List<Employee> remove=new ArrayList<Employee>();
        for(Employee value:employees){
            if(db.containsKey(value.getId())){
                remove.add(value);
            }
            else{
                db.put(value.getId(),value);
            }
        }

        for(Employee value:remove){
            employees.remove(value);
        }

        for(Employee value:employees){
            System.out.println(value);
        }

    }
}