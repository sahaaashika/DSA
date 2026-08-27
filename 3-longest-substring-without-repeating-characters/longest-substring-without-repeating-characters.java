class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

         int l=0;
        int max=0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (map.containsKey(ch)) {
               l = Math.max(l, map.get(ch) + 1);
            }
            
            map.put(ch, right);
            max = Math.max(max, right - l + 1);
        }

        return max;
    }
}