class Solution {
    public int pivotIndex(int[] arr) {
        int lsum=0,rsum=0,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum-arr[0]==0) return 0;
        for(int i=1;i<arr.length;i++){
            lsum+=arr[i-1];
            rsum=sum-lsum-arr[i];
            if(lsum==rsum)
            return i;
        }
        return-1;
    }
}