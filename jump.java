public class jump {
    
}
class Solution {
    public int jump(int[] nums) {
        // dp approach
        // int n = nums.length;
        // int[] dp=new int[n];
        // for(int i=n-2;i>=0;i--) {
        //     dp[i]=n;
        //     for(int j=1;j<=nums[i]&&i+j<n;j++) 
        //         dp[i]=Math.min(dp[i],1+dp[i+j]);
        // }
        // return dp[0];        

        // iterative approach
        if (nums.length == 0 || nums[0] == 0)
			return 0;

		if (nums.length == 1)
			return 0;

		int jumps = 0;
		int currentEnd = 0;
		int currentFarthest = 0;

		for (int i = 0; i < nums.length; i++) {
			currentFarthest = Math.max(currentFarthest, i + nums[i]);

			if (i == currentEnd) {
				currentEnd = currentFarthest;
				jumps++;

				if (currentEnd >= nums.length - 1)
					break;

			}

		}

		return jumps;
    }   
    
}