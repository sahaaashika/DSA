class Solution {
    public void sortColors(int[] arr) {
        int low=0,j=0,high=arr.length-1;
        while(j<=high){
            if(arr[j]==2){
                int temp=arr[high];
                arr[high]=arr[j];
                arr[j]=temp;
                high--;
            }
            else if(arr[j]==0){
                int temp=arr[low];
                arr[low]=arr[j];
                arr[j]=temp;
                low++;
                j++;
            }
            else
            j++;

        }
        return ;
    }
}