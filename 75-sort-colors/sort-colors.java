class Solution {
    public void sortColors(int[] arr) {
       int l=0,h=arr.length-1,j=0;
       while(h>=j){
        if(arr[j]==2){
            int temp=arr[j];
            arr[j]=arr[h];
            arr[h]=temp;
            h--;
        }
        else if(arr[j]==0){
            arr[j]=arr[l];
            arr[l]=0;
            l++;
            j++;
        }
        else 
        j++;
       }
    }
}