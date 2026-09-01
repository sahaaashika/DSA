class Solution {
    public boolean hasAlternatingBits(int n) {
        int bit1,bit2;
         bit1= n&1;
        while(n>0){
            n=n>>1;
            bit2=n & 1;
            if(bit1==bit2)
                return false;
            
            bit1=bit2;
        }
        return true;
    }
}