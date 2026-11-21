class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int j=0,ans=0,maxfreq=0;
        char ch;
        for( int i=0;i<s.length();i++){
            ch=s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
                maxfreq=Math.max(maxfreq,map.get(ch));
                while(i-j+1-maxfreq>k &&j<s.length())
                {
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                    j++;
                }
                    ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}