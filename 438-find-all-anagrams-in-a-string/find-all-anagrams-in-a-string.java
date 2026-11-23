class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans= new ArrayList<>();
        int n= p.length();
        if(s.length()<p.length())
    return ans;
        int[] cp= new int[26];
        int[] cs= new int[26];
        for (int i = 0; i <n; i++) {
            cp[p.charAt(i)-'a']++;
            cs[s.charAt(i)-'a']++;
        }
            if( Arrays.equals(cp, cs))
            ans.add(0);
        int j=0;
        for (int i = 1; i <=s.length()-n; i++) {
            cs[s.charAt(j++)-'a']--;
            cs[s.charAt(i+n-1)-'a']++;
            if( Arrays.equals(cp, cs))
            ans.add(i);
        }
        return ans;
    }
}