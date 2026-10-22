class Solution {
    public List<String> validStrings(int n) {
        List<String> list= new ArrayList<>();
        if(n==1){
            list.add("0");
            list.add("1");
            return list;
        }
        helper(list, new StringBuilder(), 0,n );
            return list;
    }
    public void helper(List<String> list, StringBuilder sb, int i, int n){
        if(check(sb) && i==n){
            list.add(sb.toString());
            return;
        }
        if(i>n)
            return;
        sb.append("0");
        helper(list,sb,i+1,n);
        sb.deleteCharAt(sb.length() - 1);
        sb.append("1");
        helper(list,sb,i+1,n);
        sb.deleteCharAt(sb.length() - 1);
        
        
    }
    public boolean check(StringBuilder sb){
        for(int i=0;i<sb.length()-1;i++){
            String str = sb.substring(i,i+2);
            if(!str.contains("1"))
                return false;
        }
                return true;
    }
}