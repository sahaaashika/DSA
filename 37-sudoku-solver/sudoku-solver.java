class Solution {
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
        return;
    }

    
public boolean helper(char[][] arr, int r, int c) {
    int rn = r;
    int cn = c;

    if (c == 9) {
        rn = r + 1;
        cn = 0;
    }

    if (rn == 9)
        return true;

    if (arr[rn][cn] != '.') {
        return helper(arr, rn, cn + 1);
    }

    for (char dig = '1'; dig <= '9'; dig++) {
        if (isSafe(arr, dig, rn, cn)) {
            arr[rn][cn] = dig;

            if (helper(arr, rn, cn + 1)) {
                return true;
            }

            arr[rn][cn] = '.';
        }
    }

    return false;
}

    public boolean isSafe(char[][] arr, char dig, int r, int c) {
        for (int i = 0; i < 9; i++) {
            if (arr[r][i] == dig)
                return false;
        }
        for (int i = 0; i < 9; i++) {
            if (arr[i][c] == dig)
                return false;
        }
        int rs = (r / 3) * 3;
        int cs = (c / 3) * 3;
        for (int i = rs; i < rs + 3; i++) {
            for (int j = cs; j < cs + 3; j++) {
                if (arr[i][j] == dig)
                    return false;
            }
        }
        return true;
    }
}