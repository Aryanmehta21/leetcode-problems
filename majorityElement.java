//  Leetcode - 169
import java.util.*;
public class MajorityElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(majority(arr));
        sc.close();
    }
    public static int majority(int[] nums){
        int count =0;
        int candidate = -1;
        for(int num : nums){
            if(count == 0){
                candidate = num;
                count = 1;
            }else if(candidate == num){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}