import java.util.*;
public class SortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    public static void sort(int[] nums){
        int red = 0;
        int white = 0;
        int blue = 0;
        
        for(int num: nums){
            if(num == 0){
                red++;
            }else if(num == 1){
                white++;
            }else if(num == 2){
                blue++;
            }
        }

        for(int i=0;i<red;i++){
            nums[i] = 0;
        }
        for(int i = red;i<red+white;i++){
            nums[i] = 1;

        }
        for(int i = red+white;i<red+white+blue;i++){
            nums[i] = 2;
        }
    }
}
