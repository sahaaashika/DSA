class Solution {
    public int[][] matrixReshape(int[][] arr, int r2, int c2) {
        int r1=arr.length,
        c1=arr[0].length;
        int[][] res=new int[r2][c2];
        if(r1*c1!=r2*c2)
            return arr;
        for(int i=0;i<r1*c1;i++){
            res[i/c2][i%c2]=arr[i/c1][i%c1];
        }
        return res;
    }
}