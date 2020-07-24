/*
/*
Space : In-place algorithm
Time : O(n2) - Quadratic (Can perform better)
Unstable Algorithm
-----------------------------
Variation of Insertion Sort...
Shell sort uses larger gap value(Insertion sort uses gap as 1 as default)...
As algorithm runs, gap is reduced...
Goal is to reduce the no. of shifting...

Gap is selected as arraylength/2 and is degraded by /2...
-------------------------------
Start at gap...
Compares gap and j-gap elements and swaps...
*/
class ShellSort {
    public static void main(String[] args){
        int[] arr={20,35,-12,7,55,1,-22};

        for(int gap=arr.length/2;gap>0;gap/=2){
            for(int i=gap;i<arr.length;i++){
                int newElement=arr[i];
                int j=i;
                while(j>=gap && arr[j-gap]>newElement){
                    arr[j]=arr[j-gap];
                    j-=gap;
                }
                arr[j]=newElement;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}