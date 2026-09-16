class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res= new ArrayList<>();
        int k= (int)Math.pow(2,n);
        for(int i=0;i<k;i++){
            int gray=i^(i>>1);
            res.add(gray);
        }
        return res;
    }
}