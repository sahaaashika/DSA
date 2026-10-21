class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length, col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (check(board, word,  visited, 0, r, c))
                    return true;

            }
        }
        return false;
    }

    public boolean check(char[][] board, String word, boolean[][] visited, int i, int r, int c) {
        if(i==word.length()){
            return true;
        }
        if(r==board.length || r<0 || c<0 || c==board[0].length || visited[r][c]==true || board[r][c]!=word.charAt(i)){
            return false;
        }

        visited[r][c]=true;

        boolean found= check(board, word , visited, i+1,r,c +1) || check(board, word , visited, i+1,r-1,c) || check(board, word , visited, i+1,r,c -1) || check(board, word , visited, i+1,r+1,c );

        
        visited[r][c]=false;
        return found;

    }
}