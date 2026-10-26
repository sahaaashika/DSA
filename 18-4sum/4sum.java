class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n-3; i++) {
            if(i!=0 && nums[i-1]==nums[i]){
                            continue;
                        }
            for (int j= i+1; j < n-2; j++) {
                if(j!=i+1 && nums[j-1]==nums[j]){
                            continue;
                        }
                int l=j+1, h=n-1;
                while(h>l){
                    long sum=(long) nums[i] + nums[j] + nums[l] + nums[h] ;
                    if(sum == target){
                        ans.add(new ArrayList<>(List.of(nums[i] , nums[j] , nums[l] , nums[h])));
                        while(l!=n-1 && nums[l+1]==nums[l]){
                            l++;
                        }
                        while(h>0 && nums[h-1]==nums[h]){
                            h--;
                        }
                        l++;
                        h--;
                    }
                    else if(sum <target)
                        l++;
                    else
                        h--;
                }
            }
        }
        return ans;
    }
}