public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode Previous;

    public EmployeeNode(Employee employee){
        this.employee=employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }
 
    public EmployeeNode getPrevious() {
        return Previous;
    }

    public void setPrevious(EmployeeNode previous) {
        Previous = previous;
    }   
    
    public String toString(){
        return employee.toString();
    }

}