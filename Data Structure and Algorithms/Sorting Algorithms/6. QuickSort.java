/*
Space : In-place Algorithm
Time : O(nlogn) - base 2
Unstable Algorithm
Divide and Conquer Algorithm
Recursive
---------------------------
Uses a pivot element
At end of each iteration, pivot will be in sorted position
Values less than pivot will be to its left and greater than pivot will be to its right

*/

class QuickSort {
    public static void main(String[] args){
        int[] arr={20,35,-12,7,55,1,-22};

        quicksort(arr, 0, arr.length);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quicksort(int[] a,int start,int end){

        while(end-start<2){
            return;
        }

        int pivotindex=partition(a,start,end);
        quicksort(a,start,pivotindex);
        quicksort(a,pivotindex+1,end);
    }

    public static int partition(int[] a,int start,int end){

        int pivot=a[start];
        int i=start;
        int j=end;

        while(i<j){
            //note: Empty Loop body
            while(i<j && a[--j]>=pivot);
            if(i<j){
                a[i]=a[j];
            }
            //note: Empty Loop body
            while(i<j && a[++i]<=pivot);
            if(i<j){
                a[j]=a[i];
            }
        }

        a[j]=pivot;
        return j;
    }
}