// Leetcode - 1
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
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



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int[] result = new int[2];
        twoSum(nums , target);

    }
}