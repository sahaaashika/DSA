class Solution {
    public int[][] merge(int[][] arr) {
        List<int[]> ans= new ArrayList<>();
        Arrays.sort(arr,
(a,b) -> Integer.compare(a[0],b[0])
);
            
int s,  e=0;
        for(int i=0;i<arr.length;i++){
            if(i!=0 && e>=arr[i][1])
            continue;
              s=arr[i][0];
              e=arr[i][1];
            for(int j=i;j<arr.length;j++){
                if(arr[j][0]>=s &&arr[j][0]<=e ){
                    e=Math.max(e,arr[j][1]);
                    s=Math.min(s,arr[j][0]);
                }
                if(j==arr.length-1)
                    ans.add(new int[]{s,e});
            }

        }
        return ans.toArray(new int[ans.size()][]);
    }
}