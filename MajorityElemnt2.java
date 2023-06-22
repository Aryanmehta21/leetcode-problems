import java.util.*;
public class MajorityElemnt2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        List<Integer> list = majority(nums);
        System.out.println(list);
        sc.close();
    }

    public static List<Integer> majority(int[] nums){
        List<Integer> res = new ArrayList<>();
        if(nums.length<=2){
            for(int i =0;i<nums.length;i++){
                if(!res.contains(nums[i])){
                    res.add(nums[i]);
                }
            }
            return res;
        }
        int count = 1;
        Arrays.sort(nums);
        for(int i =1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count>nums.length/3 && !res.contains(nums[i])){
                res.add(nums[i]);
            }
        }
        return res;
    }
}
