class MergeSortDescending {
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

        if(a[mid-1]>=a[mid]){
            return;
        }
        int i=start;
        int j=mid;
        int ind=0;
        int[] temp=new int[end-start];
        while(i<mid && j<end){
            temp[ind++]=a[i]>=a[j]?a[i++]:a[j++];
        }

        System.arraycopy(a, i, a, start+ind, mid-i);
        System.arraycopy(temp, 0, a, start, ind);
    }
}