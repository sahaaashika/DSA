class Solution {
    public String[] createGrid(int r, int c) {
        String[] ans= new String[r];
        for (int i = 0; i < r; i++) {
        String str = "";
            for (int j = 0; j < c; j++) {
                if(j==0 ||i==r-1)
                str+=".";
                else
                str+="#";
            }
            ans[i]=str;
        }
        return ans;
    }
}