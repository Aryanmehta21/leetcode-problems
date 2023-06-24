import java.util.HashMap;

public class ImpMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
    }
}
