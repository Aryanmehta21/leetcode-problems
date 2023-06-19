import java.util.*;
public class FindDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(find(arr));
    }

    public static int find(int[] nums){
        int low =1 ;
        int high = nums.length-1;
        while(low<=high){
            int mid = (int)(low+(high - low)/2);
            int count = 0;
            for(int a : nums){
                if(a<=mid){
                    count++;
                }
                if(count<=mid){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return low;
    }
}
