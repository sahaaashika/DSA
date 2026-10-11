class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        //Lets solve by recursion...
        List<List<Integer>> result = new ArrayList<>();
        helper(arr, result, new ArrayList<>(), 0);
        return result;
    }

    public void helper(int[] arr, List<List<Integer>> result, List<Integer> curr, int i) {
        if(i==arr.length){
        result.add(new ArrayList<>(curr));
        return;
        }
        curr.add(arr[i]);
        helper(arr,result,curr,i+1);
        curr.remove(curr.size()-1);
        helper(arr,result,curr,i+1);

    }
}
