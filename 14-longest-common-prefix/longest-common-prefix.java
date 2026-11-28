class Solution {
    public String longestCommonPrefix(String[] strs) {
        String curr=strs[0],ans="";
        for(int i=1;i<strs.length;i++){
            ans="";
            int j=0;
            while(j<strs[i].length() && j<curr.length()){
                if(strs[i].charAt(j)==curr.charAt(j)){
                    ans+=curr.charAt(j);
                j++;
                }
                else
                break;
            }
            curr=ans;
        }
        return curr;
    }
}