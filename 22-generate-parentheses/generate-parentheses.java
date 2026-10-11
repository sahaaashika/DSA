class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>(); 
       generate(n,"",0,0,result);
       return result;
    }
    public static void generate(int n,String str,int l,int r ,List<String> result){
        if(str.length()==2*n){
            result.add(str);
            return ;
        }
        if(l<n){
            generate(n,str+"(",l+1,r,result);
        }
        if(r<l){
            generate(n,str+")",l,r+1,result);
        }
    }
}