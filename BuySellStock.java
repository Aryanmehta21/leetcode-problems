import java.util.*;
public class BuySellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProfit(arr));
        sc.close();
    }

    // public static int maxProfit(int[] prices){
    //     int minPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;
    //     for(int price: prices){
    //         if(price<minPrice){
    //             minPrice = price;
    //         }else{
    //             maxProfit = Math.max(maxProfit, price-minPrice);
    //         }
    //     }

    //     return maxProfit;
    // }
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price:prices){
            if(price<minPrice){
                minPrice = price;
            }else{
                maxProfit = Math.max(maxProfit, price-minPrice);
            }
        }
        return maxProfit;
    }
}
