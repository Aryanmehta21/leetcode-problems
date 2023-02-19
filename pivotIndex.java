class Solution {
    public int pivotIndex(int[] nums) {
        int lSum =0;
        int rSum =0;
        for(int i =1;i<nums.length;i++){
            rSum = rSum+nums[i];
        } 
            if(lSum==rSum){
                return 0;
            }
        for(int i =1;i<nums.length;i++){
            lSum += nums[i-1];
            rSum -= nums[i];

            if(lSum == rSum){
                return i;
            }
        }
        return -1;
    }
}