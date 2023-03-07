// Leetcode - 1539
class Solution {
    public int findKthPositive(int[] arr, int k) {
        // for(int i :arr){
        //     if(i<=k){
        //         k++;
        //     }else{
        //         break;
        //     }
        // }
        // return k;
        HashSet<Integer> set = new HashSet<>();
        int j = arr[arr.length-1];
        int n = j + k;

        for(int i = 1;i<=n;i++){
            set.add(i);
        }

        for(int i: arr){
            if(set.contains(i)){
                set.remove(i);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>(set);
        return ans.get(k-1);

    }
}