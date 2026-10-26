class Solution {
    public int removeElement(int[] arr, int val) {
        int l=0, r=arr.length -1;
        while(l<=r){
            if(arr[l]==val)
            {
                int temp= arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                r--;
            }
            else{
                l++;
            }
        }
        return l;
    }
}