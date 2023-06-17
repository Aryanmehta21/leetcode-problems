import java.util.*;
public class setZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        setMatrix(matrix);
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void setMatrix(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];


        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }


        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(row[i] != false || col[j] != false){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
