public class BinarySearch {
    public static void main(String[] args){
        int[] arr={-22, -15, 1, 7, 20, 35, 55};

        System.out.println("Iterative Method :");
        System.out.println(iterativeBS(arr, -15));
        System.out.println(iterativeBS(arr, 35));
        System.out.println(iterativeBS(arr, 8888));
        System.out.println(iterativeBS(arr, 1));

        System.out.println("Recursive Method :");
        System.out.println(recursiveBS(arr, -15));
        System.out.println(recursiveBS(arr, 35));
        System.out.println(recursiveBS(arr, 8888));
        System.out.println(recursiveBS(arr, 1));
    }

    public static int iterativeBS(int[] arr,int n){
        int start=0;
        int end=arr.length;

        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==n){
                return mid;
            }
            else if(arr[mid]<n){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return -1;
    }

    public static int recursiveBS(int[] arr,int n){
        return recursiveBS(arr, n, 0, arr.length);
    }

    public static int recursiveBS(int[] arr, int n, int start, int end){

        if(start>=end){
            return -1;
        }

        int mid=(start+end)/2;
        if(arr[mid]==n){
            return mid;
        }
        else if(arr[mid]<n){
            return recursiveBS(arr, n, mid+1, end);
        }
        else{
            return recursiveBS(arr, n, start, mid);
        }
    }
}