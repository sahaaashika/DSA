class Solution {
    public int count=0;
    public boolean isSafe(int[][] board, int r, int c) {
        for (int i = 0; i < r; i++)
            if (board[i][c] == 1)
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
        helper(board,  0);
        return count;
    }

    public void helper(int[][] board, int r) {
        if(r==board.length){
            count++;
            return ;
        }
        for(int i=0;i<board.length;i++){
        if(isSafe(board,r,i)){
            board[r][i]=1;
            helper(board, r+1);
        board[r][i]=0;
        }
        }
    }
        
}
    
