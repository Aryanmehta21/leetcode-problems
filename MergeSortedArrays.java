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
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = nums1.length-1;

        while(j>=0){
            if(i>=0&&nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }

}
