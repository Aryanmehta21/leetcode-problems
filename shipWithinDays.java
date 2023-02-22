// Leetcode 1011
class Solution {
    public int shipWithinDays(int[] weights, int days) {
    //     int low = Integer.MIN_VALUE;
    //     int high = 0;
    //     int ans;

    //     for(int val:weights){
    //         low = Math.max(low, val);
    //         high = high + val;
    //     }
    //     ans = high;

    //     while(low<high){
    //         int mid = (low + high)/2;

    //         if(minCap(mid, weights, days)){
    //             ans = mid;
    //             high = mid-1;
    //         }else{
    //             low = mid +1;
    //         }
    //     }
    //     return ans;
    // }

    // boolean minCap(int mid, int[] weights, int days){
    //     int sum =0;
    //     int day = 1;
    //     for(int i =0;i<weights.length;i++){

    //         if(sum + weights[i] <=mid){
    //             sum += weights[i];
    //         }else{
    //             sum = weights[i];
    //             day++;
    //         }
    //     }

    //     if(day<=days){
    //         return true;
    //     }else{
    //         return false;
    //     }

    int left = 0;
        int right = 0;
        for(int i :weights){
            left = Math.max(left,i);
            right +=i;
        }
        int mid;
        int ans = right;
        while(left<=right){
            mid = (left+right)/2;
            if(check(weights,days,mid)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }

    public boolean check(int [] weights, int days, int capacity){
        int requiredDays = 1;
        int currWeight = 0;
        for(int i:weights){
            if(currWeight+i>capacity){
                requiredDays++;
                currWeight = 0;
            }
            currWeight +=i;
        }
        if(requiredDays>days) return false;
        return true;
    }
}