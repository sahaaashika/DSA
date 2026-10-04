class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<Math.pow(2,nums.length);i++){
            List<Integer> subset= new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i>>j&1)==1){
                    subset.add(nums[j]);
                }
        }
        result.add(subset);
        }
        return result;
    }
}