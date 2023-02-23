// Leetcode - 409
class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
    int length = 0;

    for (char c : s.toCharArray()) {
        if (set.contains(c)) {
            // Found a pair for this character
            set.remove(c);
            length += 2;
        } else {
            // This character has no pair yet
            set.add(c);
        }
    }

    // Add one extra character with odd frequency to the length
    if (!set.isEmpty()) {
        length++;
    }

    return length;
    }
}