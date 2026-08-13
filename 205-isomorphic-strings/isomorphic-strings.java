class Solution {
    public boolean isIsomorphic(String s1, String s2) {
        Map<Character, Character> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                if(map.get(s1.charAt(i))!=s2.charAt(i))
            return false;

            }
            else {
                if (map.containsValue(s2.charAt(i))) {
                    return false;
                }}
            map.put(s1.charAt(i),s2.charAt(i));
        }
        return true;
    }
}