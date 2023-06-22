// Leetcode - 1
import java.util.*;
public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new SCanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = twoSum(arr, target);
        for(int i =0;i<2;i++){
            System.out.println(ans[i] + " ");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int ans = target - nums[i];
        if (map.containsKey(ans)) {
            result[0] = map.get(ans);
            result[1] = i;
            return result;
        }
        map.put(nums[i], i);
    }
    return result;
    }        
}