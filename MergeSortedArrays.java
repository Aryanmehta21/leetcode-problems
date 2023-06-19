import java.util.*;
public class MergeSortedArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        for(int i =0;i<m;i++){
            nums1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        for(int i =0;i<n;i++){
            nums2[i] = sc.nextInt();
        }
        merge(nums1, m, nums2, n);
        for(int i =0;i<nums1.length;i++){
            System.out.print(nums1[i] + " ");
        }
    }

    
}
