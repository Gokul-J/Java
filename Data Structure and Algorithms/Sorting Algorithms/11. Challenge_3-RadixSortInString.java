class RadixSortInString{
    public static void main(String[] args){
        String[] arr={"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixsort(arr,26,5);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void radixsort(String[] a,int radix,int width){
        for(int i=width-1;i>=0;i--){
            radixsinglesort(a,i,radix);
        }
    }

    public static void radixsinglesort(String[] a, int position,int radix){
        int len=a.length;
        int[] carray=new int[radix];

        for(String value:a){
            carray[getdigit(position,value)]++;
        }
        for(int j=1;j<radix;j++){
            carray[j]+=carray[j-1];
        }

        String[] temp=new String[len];
        for(int i=len-1;i>=0;i--){
            temp[--carray[getdigit(position,a[i])]]=a[i];
        }

        System.arraycopy(temp, 0, a, 0, len);
    }

    public static int getdigit(int position,String value){
        return value.charAt(position)-'a';
    }   
}