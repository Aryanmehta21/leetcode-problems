// Leetcode - 189

class Solution {
    public void rotate(int[] arr, int k) {
        k=k%arr.length;
        if(k<0){
            k+=arr.length;
        }
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    
    public static void reverse(int[]arr,int li, int ri){
        
        while(li<ri){
            int temp=arr[li];
            arr[li]=arr[ri];
            arr[ri]=temp;
            li++;
            ri--;
        }  
    }
}