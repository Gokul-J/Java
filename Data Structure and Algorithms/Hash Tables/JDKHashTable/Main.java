import java.util.HashMap;
//import java.util.Map;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){

        Employee janeJones=new Employee("Jane","Jones",123);
        Employee johnDoe=new Employee("John","Doe",4567);
        Employee marySmith=new Employee("Mary","Smith",22);
        Employee mikeWilson=new Employee("Mike","Wilson",3245);

        HashMap<String,Employee> hashMap=new HashMap<String,Employee>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe",johnDoe);
        hashMap.put("Smith",marySmith);

        System.out.println(hashMap.containsKey("Doe"));
        System.out.println(hashMap.containsValue(janeJones));

        hashMap.putIfAbsent("Doe",mikeWilson);

        System.out.println(hashMap.getOrDefault("someone", johnDoe));

        System.out.println(hashMap.remove("Smith"));

        /*Iterator<Employee> iter=hashMap.values().iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }*/

        hashMap.forEach((k,v)->System.out.println("Key : "+k+", Employee : "+v));


    }
    
}