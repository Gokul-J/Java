import java.util.PriorityQueue;

public class MinHeapJDK{
    public static void main(String[] args){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        minHeap.add(25);
        minHeap.add(-22);
        minHeap.add(1343);
        minHeap.add(54);
        minHeap.add(0);
        minHeap.add(-3492);
        minHeap.add(429);

        Object[] num=minHeap.toArray();
        for(Object i:num){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(minHeap.peek());
        System.out.println(minHeap.remove());
        System.out.println(minHeap.remove(54));
        System.out.println(minHeap.poll());
    }
}