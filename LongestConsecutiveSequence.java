import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
      }  

      System.out.println(longestSeq(arr));
    }
    public static int longestSeq(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxLength = 1;
        for(int num:nums){
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentLength = 1;
                while(set.contains(num+1)){
                    currentNum = currentNum + 1;
                    currentLength++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }
}
