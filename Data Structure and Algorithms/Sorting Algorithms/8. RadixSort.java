/*
Space : In-place depends on sort algorithm used
Time : O(n)
Time : O(nlogn)
Stable Algorithm
------------------------------------
Makes assumptions about data...
Data must have same Radix and width...
Data must be either integers or Strings...
Sorts right to left...
Sorts base on each individual digit or letter...
Must use a Stable Sort algorithm at each stage(Mostly Stable Counting Sort...)...
*/
class RadixSort {

    public static void main(String[] args){
        int[] arr={4725, 4586, 1330, 8792, 1594, 5729};

        radixsort(arr,10,4);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void radixsort(int[] a,int radix,int width){
        for(int i=0;i<width;i++){
            radixsinglesort(a,i,radix);
        }
    }

    public static void radixsinglesort(int[] a, int position,int radix){
        int len=a.length;
        int[] carray=new int[radix];

        for(int value:a){
            carray[getdigit(position,value,radix)]++;
        }
        for(int j=1;j<radix;j++){
            carray[j]+=carray[j-1];
        }

        int[] temp=new int[len];
        for(int tempIndex=len-1;tempIndex>=0;tempIndex--){
            temp[--carray[getdigit(position,a[tempIndex],radix)]]=a[tempIndex];
        }

        System.arraycopy(temp, 0, a, 0, len);
    }

    public static int getdigit(int position,int value,int radix){
        return value/(int)Math.pow(radix,position)%radix;
    }   
}