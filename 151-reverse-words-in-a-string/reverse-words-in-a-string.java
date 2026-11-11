class Solution {
    public String reverseWords(String s) {
        s=s.trim()+" ";
        String str="",ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
     if(s.charAt(i-1)==' ') continue;
                ans=str+" "+ans;
                str="";
            }
            else{
                str+=s.charAt(i);
            }
        }
    return ans.trim();
    }
}