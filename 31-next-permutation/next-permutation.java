class Solution {
    public int min(int[]arr, int i,int k){
        int ind=i;
        while(i<arr.length){
            if(arr[i]<arr[ind] && arr[i]>k)
            ind=i;
            i++;
        }
        return ind;
    }
   
    public void nextPermutation(int[] nums) {
        int i=nums.length-2,j=nums.length-1;
        while(i>=0 && j>=0){
            if(nums[i]<nums[j]){
                int l=min(nums,i+1,nums[i]);
                int temp=nums[i];
                nums[i]=nums[l];
                nums[l]=temp;
                Arrays.sort(nums, i+1, nums.length);
                return;
            }
            else{
                i--;
                j--;
            }
    }
                Arrays.sort(nums);


}
}