/*
Space : not an In-place Algorithm
Time : O(n) - because of making assumtions
To make it stable, extra steps to be added...
---------------------------------------------------------------------
Makes assumptions about data
Only works with non-negative discrete values(not on floats,strings)
Values must be in specific range(Range must be small so efficient) 
----------------------------------------------------------------------
Counts the no. of occurences of each element and stores it in countarray....
replace the input array based the countarray values....
*/
class CountingSort {
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
        int j=0;
        for(int i=min;i<=max;i++){
            while(carray[i-min]>0){
                a[j++]=i;
                carray[i-min]--;
            }
        }

    }
    
}