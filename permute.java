// Leetcode - 46

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, nums.length, nums, ans);
        return ans;
    }

    void helper(int pos, int n, int[] nums, List<List<Integer>> ans){
        if(pos>=n){
            List<Integer> permutation = convertToArray(nums);
            ans.add(new ArrayList(permutation));
            return;
        }
        for(int i = pos;i<n;i++){
            swap(pos, i, nums);
            helper(pos+1, n, nums, ans);
            swap(pos,i,nums);
        }
        return;
    }
    void swap(int i,int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    List<Integer> convertToArray(int[] nums){
        List<Integer> ans = new ArrayList<>();
        for(int ele:nums){
            ans.add(ele);
        }
        return ans;
    }
}