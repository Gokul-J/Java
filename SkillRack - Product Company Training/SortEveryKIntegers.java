/*
Input:
7 3
48 541 23 68 13 41 6
Output:
541 48 23 68 41 13 6
*/
import java.util.*;
class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		Integer[] nums=new Integer[n];
		for(int i=0;i<n;i++){
		    nums[i]=Integer.valueOf(sc.nextInt());
		}
		int i;
        for(i=0;i<n;i+=k){
            if(i+k<n){
                Integer[] nums1=new Integer[k];
                System.arraycopy(nums,i,nums1,0,k);
                Arrays.sort(nums1,Collections.reverseOrder());
                System.arraycopy(nums1,0,nums,i,k);
            }
            else{
                Integer[] nums1=new Integer[nums.length-i];
                System.arraycopy(nums,i,nums1,0,nums.length-i);
                Arrays.sort(nums1,Collections.reverseOrder());
                System.arraycopy(nums1,0,nums,i,nums.length-i);
            }
        }
        for(Integer j:nums){
            System.out.print(j+" ");
        }
	}
}