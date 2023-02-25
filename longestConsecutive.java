// Leetcode - 128

class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        // if (nums.length == 0) {
        //     return 0;
        // }
        // int maxLength = 1;
        // for (int i = 0; i < nums.length; i++) {
        //     int currentNum = nums[i];
        //     int currentLength = 1;
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[j] == currentNum + 1) {
        //             currentNum++;
        //             currentLength++;
        //         } else if (nums[j] != currentNum) {
        //             break;
        //         }
        //     }
        //     maxLength = Math.max(maxLength, currentLength);
        // }
        // return maxLength;

        if (nums.length == 0) {
            return 0;
        }
        
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int maxLength = 1;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;
                
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        return maxLength;

    }
}