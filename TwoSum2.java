import java.util.*;
public class TwoSum2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = twoSum(arr, target);
        for(int i =0;i<2;i++){
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i+1;
                    result[1] = j+1;
                }
            }
        }
        return result;
    }
}
