// Leetcode - 129
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;
    public int sumNumbers(TreeNode root) {
        String str = "";
        sum(root, str);
        return ans;
    }

    void sum(TreeNode root, String str){
        if(root == null){
            return;
        }

        str += root.val;
        if(root.left == null && root.right == null){
            ans += Integer.parseInt(str);
            return;
        }
        sum(root.left, str);
        sum(root.right, str);
    }
}