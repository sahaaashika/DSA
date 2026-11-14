class Solution {
    public int longestMonotonicSubarray(int[] arr) {
         if (arr.length == 1) return 1;
        int len=0,prev=arr[0],inc =1,dec=1;
        for(int i=1;i<arr.length;i++){
            if(prev<arr[i]){
                dec=1;
                inc++;
            }
            else if(prev>arr[i]){
                inc=1;
                dec++;
            }
            else{
                inc=1;
                dec=1;
            }
            len=Math.max(Math.max(len,inc),dec);
            prev=arr[i];
            
        }
        return len;
    }
}