class Solution {
    public List<Integer> majorityElement(int[] arr) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();
        int n=arr.length;
        for(int i=0; i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() >(n/3))
            res.add(entry.getKey());
        }
        return res;
    }
}