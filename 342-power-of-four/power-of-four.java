class Solution {
    public boolean isPowerOfFour(int n) {
        if (n==1)
        return true;
        if((n & (n-1))!=0){
            return false;
        }
        while(n>0){
            n=n>>2;
            if((n&1)==1)
            return true;
        }
        return false;
    }
}