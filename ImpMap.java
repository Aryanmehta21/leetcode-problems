import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[][] queries = new int[q][2];
        for(int i = 0;i<queries.length;i++){
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int sum = 0;
        for(int i = 0;i<queries.length;i++){
            int low = queries[i][0];
            int high = queries[i][1];
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int frequency = entry.getValue();
                if (frequency >= low && frequency <= high) {
                    sum += entry.getKey() * frequency;
                }
            }
            System.out.println(sum);
            sum = 0; 
        }
        sc.close();
    }
}
