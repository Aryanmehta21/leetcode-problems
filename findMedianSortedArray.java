class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n = nums1.length+nums2.length;
    int ans = 0;
    double val = 0;
    int k=0;
    int C[]= new int [n];
    // store the value in array 
    for (int i=0 ; i<nums1.length ; i++){
        C[i] = nums1[i];
    }
    for (int i =nums1.length ; i<n ; i++){
        C[i] = nums2[k];
        k++;
    }
    // sort the array
    
    Arrays.sort(C);
    
    // finding median value 
    
    for (int i=0 ; i<n ; i++){
        // even 
        if (n%2 ==0){
            ans = n/2;
            val = (long)(C[ans]+C[ans-1]);
			val = val/2;
            
        }
        else{
            // odd
            ans = n/2;
            val = C[ans];
        }
    }
    return val;
}   
    }
