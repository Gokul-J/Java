import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapJDK{
    public static void main(String[] args){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        maxHeap.add(25);
        maxHeap.add(-22);
        maxHeap.add(1343);
        maxHeap.add(54);
        maxHeap.add(0);
        maxHeap.add(-3492);
        maxHeap.add(429);

        Object[] num=maxHeap.toArray();
        for(Object i:num){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(maxHeap.peek());
        System.out.println(maxHeap.remove());
        System.out.println(maxHeap.remove(54));
        System.out.println(maxHeap.poll());
    }
}