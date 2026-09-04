class Solution {
    public int[] singleNumber(int[] nums) {
        int exor=0,g1=0,g2=0;
        for(int n:nums){
            exor^=n;
        }
        int diff= exor & -exor;
        for(int n:nums){
            if((n & diff) == 0)
            g1^=n;
            else
            g2^=n;
        }
        int arr[]= new int[2];
        arr[0]=g1;
        arr[1]=g2;
        return arr;
    }
}