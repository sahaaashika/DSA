class Solution {
    public boolean checkString(String s) {
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b')
            flag=1;
            if(s.charAt(i)=='a' && flag==1)
            return false;
        }
        return true;
    }
}