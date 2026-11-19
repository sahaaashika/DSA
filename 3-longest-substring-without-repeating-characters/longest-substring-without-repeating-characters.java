class Solution {
    public int lengthOfLongestSubstring(String s) {
    int i=0,j=0,len=0;
    HashMap<Character, Integer> map=new HashMap<>();
    for(i=0;i<s.length();i++){
          char ch = s.charAt(i);

            if(map.containsKey(ch)) {
                j = Math.max(j, map.get(ch) + 1);
            }

            map.put(ch, i);

        len=Math.max(len,i-j+1);
    }    
    return len;
    }
}