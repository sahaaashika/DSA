class Solution {
    public boolean isAnagram(String x, char[] cp){
        char[] cx= x.toCharArray();
        Arrays.sort(cx);
        return (new String(cx).equals( new String(cp)));
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans= new ArrayList<>();
        int n= p.length();
        char[] cp= p.toCharArray();
        Arrays.sort(cp);
        for (int i = 0; i <=s.length()-n; i++) {
            String x=s.substring(i,i+p.length());
            if(isAnagram(x,cp))
            ans.add(i);
        }
        return ans;
    }
}