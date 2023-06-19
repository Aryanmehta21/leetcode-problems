import java.util.*;
public class Search2DMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        } 
        int target = sc.nextInt();

        System.out.println(searchMatrix(arr, target));
        sc.close();
    }

    public static boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        while(left <= right){
            int mid = left + (right-left)/2;
            int midX = mid / n;
            int midY = mid % n;
            if(matrix[midX][midY] == target){
                return true;
            }
            if(matrix[midX][midY]<target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }
}
