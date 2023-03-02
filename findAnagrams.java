// Leetcode - 438
// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//       List<Integer> list = new ArrayList<Integer>();
//         int[] arr = new int[26];
//         for(int i=0;i<p.length();i++){
//             arr[p.charAt(i)-'a']++;
//         }
//         for(int i=0;i<=s.length()-p.length();i++){
//             String temp = s.substring(i,p.length()+i);
//             int[] arr1 = new int[26];
//             for(int j=0;j<p.length();j++){
//                 arr1[temp.charAt(j)-'a']++;
//             }
//             if(Arrays.equals(arr,arr1))
//                 list.add(i);
//         }
//         return list;  
//     }
// }

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0)
            return res;
        int[] hash = new int[26];
        for (char c : p.toCharArray())
            hash[c - 'a']++;
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (hash[s.charAt(right++) - 'a']-- >= 1)
                count--;
            if (count == 0)
                res.add(left);
            if (right - left == p.length() && hash[s.charAt(left++) - 'a']++ >= 0)
                count++;
        }
        return res;
    }
}
