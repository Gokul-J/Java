/*
This is stable Counting sort...
Some extra steps are added in order to preserve its order...
Thus makes it a Stable Algorithm...
*/
class StableCountingSort {
    public static void main(String[] args){
        int[] arr={2,5,9,8,2,8,7,10,4,3};

        countingsort(arr, 1, 10);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void countingsort(int[] a,int min,int max){

        int[] carray=new int[max-min+1];
        for(int i=0;i<a.length;i++){
            carray[a[i]-min]++;
        }
        for(int i=1;i<carray.length;i++){
            carray[i]+=carray[i-1];
        }

        int[] temp=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            temp[carray[a[i]-1]-1]=a[i];
            --carray[a[i]-1];
        }

        System.arraycopy(temp, 0, a, 0, a.length);
    }
    
}