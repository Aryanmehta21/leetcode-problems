// Leetcode - 875
class Solution {

    // complexity, this method contains a loop having a complexity of O(n log k) and
    // a binary search having as well, a complexity of O(n log k), thus the complexity
    // of this method is also O(n log k).
   public int minEatingSpeed(int[] piles, int h) {

       // we exponentionnaly go up until we reach a k big enough so Koko can consume
       // the bananas in h hours (might be too high)
       // this loop calls log(k) times canFinish, thus it's complexity is O(n log k)
       int k = 1;
       while(true){
           if(canFinish(piles, k, h))
               break;
           k *= 2;
       }
            
       // we do a binary search between the last known unsuffisient time (k/2) and
       // the time we know be accepted, k.
       // the binary search below calls log(k) times canFinish, thus it's complexity is O(n log k)
       int a = k / 2;
       int b = k;
       
       while(b - a > 1){
           int m = (a + b) / 2;
           if(canFinish(piles, m,h))
               b = m;
           else
               a = m;
       }
       return b;
   }
   
    // returns true if the Koko can eat the piles, at a rate k in h hours
    // order of complexity O(lenght(piles)) = O(n)
   boolean canFinish(int[] piles, int k, int h) {
       int count = 0;
       
       for(int pile:piles){
           count += (pile - 1) / k + 1; // rounded up integer division
           if(count>h) return false;    // exit earlier, if possible
       }
       
       return true;         
   }    
}