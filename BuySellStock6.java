import java.util.*;
public class BuySellStock6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maxProfit(k, arr));
        sc.close();
    }
    public static int maxProfit(int k, int[] prices){
        int[][] dp = new int[k+1][prices.length];
        for(int i = 1;i<=k;i++){
            int max = dp[i-1][0] - prices[0];
            for(int j = 1;j<prices.length;j++){
                dp[i][j] = Math.max(dp[i][j-1], prices[j] + max);
                max = Math.max(max,dp[i-1][j]-prices[j]);
            }
        }
        return dp[k][prices.length-1];
    }
}
