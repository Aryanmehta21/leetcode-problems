// Leetcode - 70

class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        // Initialize the base cases
        dp[0] = 1;
        dp[1] = 1;
        // Iterate from 2 to n
        for (int i = 2; i <= n; i++) {
            // Calculate the number of ways to climb i stairs
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        // Return the number of ways to climb n stairs
        return dp[n];
    }
}