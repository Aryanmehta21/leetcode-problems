// Leetcode - 2187
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        //The idea is given value mid, can we finish totalTrips within mid time. 
        //We have left and right bound, we want to find mid in the boundary.
        
        //Key point: We CANNOT directly set right to Long.MAX_VALUE
        //Reason: 
        //We will get very large  (right - left) / 2 + left, and it will cause overflow if our elements in time array is small
        //Therefore, we set right bound to maximum time we need which is (the min value in time array * totalTrips)
        
        long left = 1;
        //find min value in time array
        long min = time[0];
        for(int t : time){
            min = Math.min(min, t);
        }
        long right = totalTrips * min;
        
        while(left < right){
            long mid = (right - left) / 2 + left;
            
            //How many trip we can do
            long total = 0;
            for(int t : time){
                total += mid / t;
            }
            
            //We cannot reach totalTrips, means mid is too small
            if(total < totalTrips){
                left = mid + 1;
            }else{
                //We can reach totalTrips, but we want right to be as small as possible 
                //Therefore, we don't need to + 1
                right = mid;
            }
        }
        
        return left;
    }
}