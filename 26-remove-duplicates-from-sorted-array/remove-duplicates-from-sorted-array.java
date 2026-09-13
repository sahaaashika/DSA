class Solution {
    public int removeDuplicates(int[] arr) {
       int i=0;
       for(int r=1;r<arr.length;r++){
        if(arr[i]!=arr[r])
            arr[++i]=arr[r];
       }
       return i+1;
    }
}