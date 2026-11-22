class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        if (k <= 1) return 0;

        int i=0,j=0,pro=1,sub=0;
        while(i<arr.length){
            pro*=arr[i];
            
            while(pro>=k &&j<arr.length){
                pro/=arr[j++];
            }
            
            sub += (i - j + 1);
            i++;
        }
        return sub;
            }
}