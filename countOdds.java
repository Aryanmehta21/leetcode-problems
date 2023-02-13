
// Time Limit Exceed on Leetcode.
class Solution {
    public int countOdds(int low, int high) {
        int ans = 0;
        for(int i=low;i<=high;i++){
            if(i%2 ==1){
                ans++;
            }
        }
        return ans;
    }
}

// Optimised all testcases passed.
class Solution {
    public int countOdds(int low, int high) {
        // int ans = 0;
        // for(int i=low;i<=high;i++){
        //     if(i%2 ==1){
        //         ans++;
        //     }
        // }
        // return ans;
        int total = high-low+1;
        if(low%2!=0 && high%2!=0){
            return total/2+1;
        }else{
            return total/2;
        }  

    }
}