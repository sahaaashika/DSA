class Solution {
    public int[][] merge(int[][] arr) {
        List<int[]> ans= new ArrayList<>();
        Arrays.sort(arr,
(a,b) -> Integer.compare(a[0],b[0])
);
            
int  s=arr[0][0],
              e=arr[0][1];;
        for(int i=1;i<arr.length;i++){
             
                if(arr[i][0]<=e ){
                    e=Math.max(e,arr[i][1]);
                }
                else{
                    ans.add(new int[]{s,e});
            
             s=arr[i][0];
              e=arr[i][1];}}
                    ans.add(new int[]{s,e});

        return ans.toArray(new int[ans.size()][]);
    }
}