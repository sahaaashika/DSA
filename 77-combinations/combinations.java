class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        helper(result,new ArrayList<>(),1, n,k );
        return result;
    }
    public void helper(List<List<Integer>> result, List<Integer> curr,int i, int n, int k) {
        if(curr.size()==k){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(i>n){
            return;
        }
        curr.add(i);
        helper(result,curr,i+1, n,k );
        curr.remove(curr.size()-1);
        helper(result,curr,i+1 , n,k );
    }
    
}