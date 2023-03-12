// Leetcode - 41
class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 1){
            if(nums[0] == 1)return 2;
            else return 1;
        }

        HashSet<Integer>set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        
        for(int i = 1; i <= 10000005; i++){
            if(set.contains(i) == false)return i;
        }
        return -1;
    }
}