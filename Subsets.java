import java.util.*;
public class Subsets {

    public static List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> res = new ArrayList<>();
        generateSubsets(0, arr, new ArrayList<>(), res);
        return res;
    }

    public static void generateSubsets(int index, int[] arr, List<Integer> curr, List<List<Integer>> res){
        
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = subsets(arr);
        System.out.println(ans);
    }
}
