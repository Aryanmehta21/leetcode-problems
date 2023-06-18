// Leetcode - 189

import java.util.Scanner;

class rotate {
    public static void rotateA(int[] arr, int k) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateA(arr, k);
        for(int i: arr){
            System.out.print(i + " ");
        }
        sc.close();
    }
}