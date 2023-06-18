import java.util.*;
public class MergeIntervals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for(int i =0;i<intervals.length;i++){
            for(int j =0;j<intervals[0].length;j++){
                intervals[i][j] = sc.nextInt();
            }
        }

        int[][] ans = merge(intervals);
        for(int i =0;i<ans.length;i++){
            for(int j =0;j<ans[0].length;j++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        for(int[] interval : intervals){
            if(res.size() == 0){
                res.add(interval);
            }else{
                int prevInterval[]= res.get(res.size()-1);
                if(interval[0]<=prevInterval[1]){
                    prevInterval[1] = Math.max(prevInterval[1], interval[1]);
                }else{
                    res.add(interval);
                }
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
