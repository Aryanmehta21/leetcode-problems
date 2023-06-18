import java.util.*;
public class MaximumSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubarray(arr));
        sc.close();
    }
    public static int maxSubarray(int[] nums){
        int maxSum = nums[0];
        int curSum = 0;
        for(int i =0;i<nums.length;i++){
            curSum = curSum + nums[i];
            if(curSum > maxSum){
                maxSum = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }
        return maxSum;
    }
}
