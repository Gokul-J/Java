public class LinearProbedHashTable {

    private StoredEmployee[] hashtable;
    
    public LinearProbedHashTable(){
        hashtable=new StoredEmployee[10];
    }

    public void put(String key,Employee employee){
        int hashedkey=hashkey(key);
        //Linear Probing....
        if (occupied(hashedkey)) {
            int stopindex=hashedkey;
            if (hashedkey == hashtable.length - 1) {
                hashedkey = 0;
            } 
            else {
                hashedkey++;
            }

            while (occupied(hashedkey) && hashedkey!=stopindex) {
                hashedkey=(++hashedkey)%hashtable.length;
            }
        }

        if(hashtable[hashedkey]!=null){
            System.out.println("Sorry, There's already a employee at positon "+hashedkey);
        }
        else{
            hashtable[hashedkey]=new StoredEmployee(key,employee);
        }
    }

    public Employee get(String key){
        int hashedkey=findkey(key);
        if(hashedkey==-1){
            return null;
        }
        return hashtable[hashedkey].employee;
    }

    public Employee remove(String key){
        int hashedkey=findkey(key);
        if(hashtable[hashedkey]==null){
            return null;
        }

        Employee employee=hashtable[hashedkey].employee;
        hashtable[hashedkey]=null;

        //Rehashing....
        StoredEmployee[] oldhashtable=hashtable;
        hashtable=new StoredEmployee[oldhashtable.length];
        for(int i=0;i<oldhashtable.length;i++){
            if(oldhashtable[i]!=null){
                put(oldhashtable[i].key,oldhashtable[i].employee);
            }
        }
        return employee;
    }

    private int hashkey(String key){
        return key.length()%hashtable.length;
    }

    private int findkey(String key){
        int hashedkey=hashkey(key);
        if(hashtable[hashedkey]!=null && hashtable[hashedkey].key.equals(key)){
            return hashedkey;
        }

        //Linear Probing....
        int stopindex = hashedkey;
        if (hashedkey == hashtable.length - 1) {
            hashedkey = 0;
        } else {
            hashedkey++;
        }

        while (hashedkey != stopindex && hashtable[hashedkey]!=null && !hashtable[hashedkey].key.equals(key)) {
            hashedkey = (++hashedkey) % hashtable.length;
        }

        if(hashtable[hashedkey]!=null && hashtable[hashedkey].key.equals(key)){
            return hashedkey;
        }
        else{
            return -1;
        }

    }

    public boolean occupied(int hashedkey){
        return hashtable[hashedkey]!=null;
    }

    public void printhashtable(){
        for(int i=0;i<hashtable.length;i++){
            if(hashtable[i]==null){
                System.out.println("empty");
            }
            else{
                System.out.println("Position "+i+":"+hashtable[i].employee);
            }
        }
    }
}