class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>(); 
        generate(result , "", n, 0, 0); 
        return result;
    }
    public void generate(List<String> ans,String s,int n,int open, int close) {
        if(s.length()==2*n)
        {
            ans.add(s);
            return;
        }
        if(open<n)
        generate(ans,s+"(",n,open+1,close);
        if(close<open)
        generate(ans,s+")",n,open,close+1);

    }
}