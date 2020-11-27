import java.util.LinkedList;

public class stack {
  public static void main(String[] args){
    LinkedList<Integer> stack = new LinkedList<Integer>();

    stack.push(10);
    stack.push(20);
    stack.push(30);

    // System.out.println(stack.peek());
    // System.out.println(stack.pop());
    // System.out.println(stack.peek());
    // System.out.println(stack.pop());

    LinkedList<Integer> queue = new LinkedList<Integer>();
    queue.push(1);
    queue.push(2);
    queue.push(3);

    System.out.println(queue.peekLast());
    System.out.println(queue.pollLast());
    System.out.println(queue.peekLast());

  }
}
