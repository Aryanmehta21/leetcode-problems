// Leetcode - 3
import java.util.*;
public class LongestSubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(length(str));
    }
    public static int length(String s){
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i =0;i<s.length();i++){
            for(int j = 0;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                }else{
                    set.add(s.charAt(j));
                    max = Math.max(j-i, max);
                }
            }
        }
        return max;
    }
}