class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
         Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
        int f=map.getOrDefault(num,0)+1;
        map.put(num,f);
        if(f>nums.length/3)
        if(!res.contains(num))
        res.add(num);
        }
        return res;
    }
}