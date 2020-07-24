/*
Space : In-place algorithm
Time : O(n2) - Quadratic
Stable Algorithm
-----------------------------
Considers array as Sorted and Unsorted partition....
Compares first element in unsorted partition and places it in correct postition in sorted partition....
Moves all elements in sorted partition to right until position is found....
*/
class InsertionSort {
    public static void main(String[] args){
        int[] arr={20,35,-12,7,55,1,-22};
        
        for(int firstUnsortedIndex=1;firstUnsortedIndex<arr.length;firstUnsortedIndex++){
            int temp=arr[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i>0 && arr[i-1]>temp;i--){
                arr[i]=arr[i-1];
            }
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}