import java.util.*;
public class RepeatAndMissingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> ans = repeatedNumber(arr);
        System.out.println(ans);
        sc.close();
    }
    public static List<Integer> repeatedNumber(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int duplicate = 0;
        int missing = 0;
        for(int i =0;i<arr.length;i++){
            if(set.contains(arr[i])){
                duplicate = arr[i];
            }else{
                set.add(arr[i]);
            }
        }
        for(int i =0;i<=arr.length;i++){
            if(set.contains(i)){
                continue;
            }else{
                missing = i;
            }
        }
        result.add(duplicate);
        result.add(missing);
        return result;
    }
}
