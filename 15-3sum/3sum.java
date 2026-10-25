class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i!=0)
            if(arr[i]==arr[i-1])
            continue;
            int l = i + 1, h = arr.length - 1;
            while (l < h) {
                if (arr[i] + arr[l] + arr[h] == 0) {
                    ans.add(new ArrayList<>(Arrays.asList(arr[i], arr[l], arr[h])));
                    while (l < h && arr[l] == arr[l + 1]) {
                        l++;
                    }
                    while (l < h && arr[h] == arr[h - 1]) {
                        h--;
                    }

                    l++;
                    h--;
                }

                else if (arr[i] + arr[l] + arr[h] > 0) {
                    h--;
                }
                else  {
                    l++;
                }
            }
        }

        return ans;
    }
}