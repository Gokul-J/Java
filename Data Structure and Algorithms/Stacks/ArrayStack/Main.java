public class Main {
    public static void main(String[] args){

        Employee janeJones=new Employee("Jane","Jones",123);
        Employee johnDoe=new Employee("John","Doe",4567);
        Employee marySmith=new Employee("Mary","Smith",22);
        Employee mikeWilson=new Employee("Mike","Wilson",3245);

        ArrayStack stack=new ArrayStack(10);

        //System.out.println(stack.pop());

        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);

        stack.printStack();
        stack.size();
        System.out.println();

        System.out.println("PEEKED: "+stack.peek()+"\n");

        stack.pop();

        stack.printStack();

        stack.size();
    }
    
}