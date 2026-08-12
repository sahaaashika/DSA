class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
        int f=map.getOrDefault(num,0)+1;
        map.put(num,f);
        if(f>nums.length/2)
        return num;
        }
        return 0;
    }
}