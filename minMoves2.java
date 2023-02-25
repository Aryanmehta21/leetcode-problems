// Leetcode - 462
class Solution {
    public int minMoves2(int[] arr) {
        Arrays.sort(arr);
        int i =0;
        int j = arr.length-1;
        int count = 0;
        while(i<j){
            count = count + (arr[j] - arr[i]);
            i++;
            j--;
        }
        return count;
    }
}