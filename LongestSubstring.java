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
        int i = 0;
        int j = 0;
        while(i<s.length() && j<s.length()){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }else{
                set.add(s.charAt(j));
                j++;
                max = Math.max(j-i, max);
            }
        }
        return max;
    }
}