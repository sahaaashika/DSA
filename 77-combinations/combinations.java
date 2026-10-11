class Solution {
    public void helper(List<List<Integer>> result ,List<Integer> curr,int n, int k,int i) {
    if(curr.size()==k){
        result.add(new ArrayList<>(curr));
        return;
    }
    if(i>n)
    return;
    curr.add(i);
    helper(result,curr,n,k,i+1);
    curr.remove(curr.size()-1);
    helper(result,curr,n,k,i+1);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        helper(result, new ArrayList<>(), n, k,1);
        return result;
    }
}