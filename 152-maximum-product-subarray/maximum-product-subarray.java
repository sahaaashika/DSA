class Solution {
    public int maxProduct(int[] arr) {
        int minpro=arr[0], maxpro=arr[0],ans=arr[0];
        for(int i=1;i<arr.length;i++){
            int x=arr[i];
            if(x<0){
                int temp=minpro;
                minpro=maxpro;
                maxpro=temp;
            }
            minpro=Math.min(x,minpro*x);
            maxpro=Math.max(x,maxpro*x);
            ans=Math.max(maxpro,ans);
            
        }
        return ans;
    }
}