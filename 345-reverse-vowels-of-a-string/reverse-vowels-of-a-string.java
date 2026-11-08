class Solution {
    public String reverseVowels(String s) {
        char ch[]=s.toCharArray();
        int l=0,r=s.length()-1;
        while(l<r){
            while(l < r && !isVowel(ch[l])){
                l++;
            }
            while(l < r && !isVowel(ch[r])){
                r--;
            }
            if(l!=ch.length &&r!=ch.length){
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }
        }
            return String.valueOf(ch);
    }

    public boolean isVowel(char ch){
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U')
        return true;
        return false;
    }
}