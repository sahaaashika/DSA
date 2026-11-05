class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0, len=nums.length+1, j=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                len=Math.min(len,i-j+1);
                sum-=nums[j++];
            }
        }
        return (len==nums.length+1?0:len);
    }
}