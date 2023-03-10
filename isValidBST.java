// Leetcode - 98

class Solution {
    TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        
        if(isValidBST(root.left) && (prev == null || root.val > prev.val)) {
            prev = root;
            return isValidBST(root.right);
        }
        
        return false;
    }
}