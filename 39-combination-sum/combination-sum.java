class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int k) {
        List<List<Integer>> ans = new ArrayList<>();
       helper(arr,k,0,ans,new ArrayList<>());
       return ans;
    }
    public void helper(int[] arr, int rem,int i,List<List<Integer>> ans, List<Integer> curr )
    {
        if(rem==0 ){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(rem<0 || i==arr.length){
            return;
        }
        curr.add(arr[i]);
        helper(arr,rem-arr[i],i,ans,curr);
        curr.remove(curr.size()-1);
        helper(arr,rem,i+1,ans,curr);
    }
}