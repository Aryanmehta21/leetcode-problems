// Leetcode - 502
class Solution {
    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        // int res = W;
        // while(k-->0){
        //     int max = -1;
        //     int index = -1;
        //     for(int i=0; i<Capital.length; i++){
        //         if(Capital[i] <= res && Profits[i] > max){
        //             max = Profits[i];
        //             index = i;
        //         }
        //     }
        //     if(index>=0){
        //         res += max;
        //         Profits[index] = 0;
        //     }
        // }
        
        // return res;
        PriorityQueue<int[]> pqCap = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        PriorityQueue<int[]> pqPro = new PriorityQueue<>((a, b) -> (b[1] - a[1]));
        
        for (int i = 0; i < Profits.length; i++) {
            pqCap.add(new int[] {Capital[i], Profits[i]});
        }
        
        for (int i = 0; i < k; i++) {
            while (!pqCap.isEmpty() && pqCap.peek()[0] <= W) {
                pqPro.add(pqCap.poll());
            }
            
            if (pqPro.isEmpty()) break;
            
            W += pqPro.poll()[1];
        }
        
        return W;
    }
}