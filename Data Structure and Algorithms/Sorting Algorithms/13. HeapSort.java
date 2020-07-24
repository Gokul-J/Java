class HeapSort {

    public int[] heap;
    public int size;

    public HeapSort(int capacity){
        heap = new int[capacity];
    }

    public static void main(String[] args) {
        HeapSort heap = new HeapSort(10);
        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();

        heap.sort();
        heap.printHeap();
    }

    public void sort(){
        int lastHeapIndex=size-1;
        for(int i=0;i<lastHeapIndex;i++){
            int temp=heap[0];
            heap[0]=heap[lastHeapIndex-i];
            heap[lastHeapIndex-i]=temp;

            fixHeapBelow(0, lastHeapIndex-i-1);
        }
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is Full");
        }

        heap[size] = value;
        fixHeapAbove(size);
        size++;
    }

    public int peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Heap is Empty");
        }

        return heap[0];
    }

    public int delete(int index){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Heap is Empty");
        }

        int parent = getParent(index);
        int deletedValue=heap[index];

        heap[index]=heap[size-1];

        if(index==0 || heap[index]<heap[parent]){
            fixHeapBelow(index, size-1);
        }
        else{
            fixHeapAbove(index);
        }

        size--;
        return deletedValue;
    }

    private void fixHeapAbove(int index){
        int newvalue=heap[index];
        while(index>0 && newvalue>heap[getParent(index)]){
            heap[index]=heap[getParent(index)];
            index=getParent(index);
        }
        heap[index]=newvalue;
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {
        int childToSwap;

        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                } else {
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }

                if (heap[index] < heap[childToSwap]) {
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                } else {
                    break;
                }
                index = childToSwap;
            } else {
                break;
            }
        }
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }
}