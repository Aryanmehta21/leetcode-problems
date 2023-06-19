import java.util.*;
public class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(pow(x,n));
        sc.close();
    }
    public static double pow(double x, int n){
        if(n<0){
            n=-n;
            x=1/x;
        }
        return helper(x, n);
    }

    private static double helper(double x, int n){
        if(n==0) return 1.0;
        if(n%2==0){
            return pow(x*x, n/2);
        }else{
            return x*pow(x*x, n/2);
        }
    }
}
