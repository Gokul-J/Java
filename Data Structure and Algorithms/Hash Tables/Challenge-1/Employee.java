public class Employee{
    private String firstname;
    private String lastname;
    private int id;

    public Employee(String firstname, String lastname, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    
    @Override
    public String toString() {
        return "Employee [firstname=" + firstname + ", id=" + id + ", lastname=" + lastname + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}