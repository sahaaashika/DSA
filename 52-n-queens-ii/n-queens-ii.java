class Solution {
    public boolean isSafe(int[][] board, int r, int c) {
        for (int i = 0; i < r; i++)
            if (board[i][c] == 1)
                return false;

        for (int i = 0; i <c; i++)
            if (board[r][i] == 1)
                return false;

        
        int row=r-1;
        int col=c-1;
        while(row>=0 && col>=0){
            if(board[row--][col--]==1)
            return false;
        }
         row=r-1;
         col=c+1;
        while(row>=0 && col<board.length){
            if(board[row--][col++]==1)
            return false;
        }
        return true;
    }

    public int totalNQueens(int n) {
        int[][] board = new int[n][n];
        List<List<List<Integer>>> ans=new ArrayList<>();
        helper(ans,board,  0);
        return ans.size();
    }

    public void helper(List<List<List<Integer>>> ans,int[][] board, int r) {
        if(r==board.length){
    List<List<Integer>> l2=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                List<Integer> l1=new ArrayList<>();
                for(int j=0;j<board.length;j++){
                    l1.add(board[i][j]);
                }
                l2.add(l1);
            }
            ans.add(l2);
            return ;
        }
        for(int i=0;i<board.length;i++){
        if(isSafe(board,r,i)){
            board[r][i]=1;
            helper(ans,board, r+1);
        board[r][i]=0;
        }
        }
        }
    }
