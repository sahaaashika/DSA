class Solution {
    public boolean check(String s) {
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
                l++;
                r--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n= s.length();
        String ans = "";
         for (int l = 0; l < n; l++) {
            for (int r = n - 1; r >= l; r--) {
                if (r - l + 1 <= ans.length())
                    break;

                if (check(s.substring(l, r + 1))) {
                    ans = s.substring(l, r + 1);
                    break;
                }
            }
        }

        return ans;
    
    }
}