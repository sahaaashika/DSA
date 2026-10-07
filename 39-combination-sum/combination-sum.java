class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        comb(ans,new ArrayList<>(),0,k,arr);
        return ans;
    }
    public void comb(List<List<Integer>> ans,List<Integer> l1,int i,int rem,int[] arr){
        if(rem==0){
            ans.add(new ArrayList<>(l1));
            return;
        }
        if(rem<0 ||i==arr.length)
            return;
        l1.add(arr[i]);
        comb(ans,l1,i,rem-arr[i],arr);
        l1.remove(l1.size()-1);
        comb(ans,l1,i+1,rem,arr);
    }
}