class Solution {
    public void sortColors(int[] arr) {
        int low = 0, high = arr.length - 1, j=0;
        while (j <= high) {
             if(arr[j]==0){
                int temp=arr[j];
                arr[j]=arr[low];
                arr[low]=temp;
                low++;
                j++;
             }
             else if(arr[j]==2){
                int temp=arr[j];
                arr[j]=arr[high];
                arr[high]=temp;
                high--;
             }
             else if(arr[j]==1){
             j++;
             }
        }
        return;
    }
}