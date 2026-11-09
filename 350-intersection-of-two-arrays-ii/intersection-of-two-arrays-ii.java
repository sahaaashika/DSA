class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
        ArrayList <Integer> ans=new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int f=0,s=0;
        while(f<arr1.length && s<arr2.length){
            
            while(f<arr1.length && s<arr2.length && arr1[f]<arr2[s]){
                f++;
            }
            while(f<arr1.length && s<arr2.length && arr1[f]>arr2[s]){
                s++;
            }
            if(f<arr1.length && s<arr2.length && arr1[f]==arr2[s])
            {
            ans.add(arr1[f]);
            f++;
            s++;
            }
        }
        int res[]= new int[ans.size()];
        for( int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}