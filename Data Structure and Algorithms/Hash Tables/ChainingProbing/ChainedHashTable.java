import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable(){
        hashtable=new LinkedList[10];
        for(int i=0;i<hashtable.length;i++){
            hashtable[i]=new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key,Employee employee){
        int hashedkey=hashkey(key);
        hashtable[hashedkey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key){
        int hashedkey=hashkey(key);
        ListIterator<StoredEmployee> iter=hashtable[hashedkey].listIterator();
        StoredEmployee employee=null;
        while(iter.hasNext()){
            employee=iter.next();
            if(employee.key.equals(key)){
                return employee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key){
        int hashedkey=hashkey(key);
        ListIterator<StoredEmployee> iter=hashtable[hashedkey].listIterator();
        int index=-1;
        StoredEmployee employee=null;
        while(iter.hasNext()){
            employee=iter.next();
            index++;
            if(employee.key.equals(key)){
                break;
            }
        }

        if(employee==null || !employee.key.equals(key)){
            return null;
        }
        else{
            hashtable[hashedkey].remove(index);
            return employee.employee;
        }
    }

    private int hashkey(String key){
        return key.length()%hashtable.length;
    }

    public void printhashtable(){
        for(int i=0;i<hashtable.length;i++){
            System.out.print("Position "+i+" : ");
            if(hashtable[i].isEmpty()){
                System.out.println("Empty");
            }
            else{
                ListIterator<StoredEmployee> iter=hashtable[i].listIterator();
                while(iter.hasNext()){
                    System.out.print(iter.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }
    }
}