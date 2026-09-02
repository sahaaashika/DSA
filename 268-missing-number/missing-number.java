class Solution {
    public int missingNumber(int[] nums) {
        int ex=0;
        for(int i=0;i<nums.length;i++){
            ex^=i;
            ex^=nums[i];
        }
            ex^=nums.length;

        return ex;
    }
}