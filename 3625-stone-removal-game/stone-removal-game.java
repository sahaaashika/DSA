class Solution {
    int i = 10, j = 0;

    public boolean canAliceWin(int n) {
        if (n < i) {
            if (j % 2 == 0)
                return false;
                else 
                return true;
        }
        j++;
        return canAliceWin(n - i--);
    }
}