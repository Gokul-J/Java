/*
Space: Not an in-place algorithm
Time : O(nlogn)-base 2
Stable Algorithm
Divide and Conquer Algorithm
Recursive
Two Phases : Splitting and Merging
-------------------------------------
Array is splitted to left and right subarrays continously until it becomes 1....
Then is merged in a sorted manner...
*/
class MergeSort {
    public static void main(String[] args){
        int[] arr={20,35,-12,7,55,1,-22};
        mergesort(arr,0,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergesort(int[] a,int start,int end){
        if(end-start<2){
            return;
        }
        int mid=(start+end)/2;
        mergesort(a,start,mid);
        mergesort(a,mid,end);
        merge(a,start,mid,end);
    }

    public static void merge(int[] a,int start,int mid,int end){

        if(a[mid-1]<=a[mid]){
            return;
        }
        int i=start;
        int j=mid;
        int tempIndex=0;
        int[] temp=new int[end-start];
        while(i<mid && j<end){
            temp[tempIndex++]=a[i]<=a[j]?a[i++]:a[j++];
        }

        System.arraycopy(a, i, a, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, a, start, tempIndex);
    }
}