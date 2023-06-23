import java.util.*;
public class BuySellStock4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(profit(arr));
        sc.close();
    }

    public static int profit(int[] prices){
        int obsp = -prices[0];
        int ossp = 0;
        int ocsp = 0;

        for(int i =1;i<prices.length;i++){
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;

            if()
        }
    }
}
