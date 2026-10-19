class Solution {
    public int value(char ch) {
        if(ch=='I') return 1;
        if(ch=='V')  return 5;
        if(ch=='X') return 10;
        if(ch=='L') return 50;
        if(ch=='C') return 100;
        if(ch=='D') return 500;
        else return 1000;
    }
    public int romanToInt(String s) {
        int val=0, i=0;
            while(i<s.length()){
                 if(i<s.length()-1  && value(s.charAt(i+1))>value(s.charAt(i)))
                val-=value(s.charAt(i));
                else
                val+=value(s.charAt(i));
                
                i++;
            
        }
return val;
    }
}