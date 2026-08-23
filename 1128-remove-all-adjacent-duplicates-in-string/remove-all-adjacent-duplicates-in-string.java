class Solution {
    public String removeDuplicates(String s) {
        char[] arr = new char[s.length()];
        int top = 0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(top==0){
                arr[top]=ch;
                top++;
            }
            else if(top>0 && ch!=arr[top-1]){
                arr[top++]=ch;
            }
            else{
                top--;
            }
        }
        return new String(arr, 0, top);
    }
}