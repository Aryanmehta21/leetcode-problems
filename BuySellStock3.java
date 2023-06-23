import java.util.*;
public class BuySellStock3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int fee = sc.nextInt();
        System.out.println(profit(arr, fee));
    }
    public static int profit(int[] prices, int fee){
        int buy = Integer.MAX_VALUE;
        int sell = 0;

        for(int price:prices){
            buy = Math.max(buy, sell - price);
            sell = Math.max(sell, buy + price - fee);
        }
        return sell;
    }
}
