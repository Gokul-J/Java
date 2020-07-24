class InsertionSortInRecursion {
    public static void main(String[] args){
        int[] arr={20,35,-12,7,55,1,-22};
        
        insertionsort(arr,arr.length);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionsort(int[] arr,int len){

        if(len<2){
            return;
        }

        insertionsort(arr, len-1);
        int temp=arr[len-1];
        int j;
        for(j=len-1;j>0 && arr[j-1]>temp;j--){
            arr[j]=arr[j-1];
        }
        arr[j]=temp;
    }
}