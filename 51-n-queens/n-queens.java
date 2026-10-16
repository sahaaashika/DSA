class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] curr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                curr[i][j] = '.';
        }
        helper(ans, curr, 0, n);
        return ans;
    }

    public void helper(List<List<String>> ans, char[][] curr ,int r, int n){
        if(r==n){
            List<String> list= new ArrayList<>();
            for(int i=0;i<n;i++){
                String s=""; 
            for(int j=0;j<n;j++){
                s+=curr[i][j];
            }
            list.add(s);
            }

        ans.add(list);
        return;
        }

        for(int i=0;i<n;i++){
            if(isSafe(curr,r,i)){
                curr[r][i]='Q';
        helper(ans ,curr , r+1 ,n);
                curr[r][i]='.';}
        }
    }
    public boolean isSafe(char[][] arr, int r,int c){
        for(int i=0;i<r;i++){
            if(arr[i][c]=='Q')
            return false;
        }
        int row=r-1;
        int col=c-1;
        while(row>=0 && col>=0){
            if(arr[row--][col--]=='Q')
            return false;
        }
         row=r-1;
         col=c+1;
        while(row>=0 && col<arr.length){
            if(arr[row--][col++]=='Q')
            return false;
        }
        return true;
    }
}