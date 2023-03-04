// Leetcode - 136
class Solution {
    public int singleNumber(int[] arr) {
       HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                set.remove(arr[i]);
                
            }else{
                set.add(arr[i]);
            }
        }
        for(int i:set){
            return i;
        }
        return -1;
        
    }
}