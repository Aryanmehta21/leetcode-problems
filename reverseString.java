// Leetcode - 344

class Solution {
    public void reverseString(char[] s) {
        int startIndex = 0;
        int endIndex = s.length - 1;
        char temp;
        while (startIndex < endIndex) {
            temp = s[startIndex];
            s[startIndex] = s[endIndex];
            s[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}