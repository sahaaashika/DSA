class Solution {
    public int missingNumber(int[] nums) {
        int miss=0,n= nums.length;
        for(int i=1;i<=n;i++){
            miss^=i;
        }
        for(int i=0;i<n;i++){
            miss^=nums[i];
        }
        return miss;
    }
}