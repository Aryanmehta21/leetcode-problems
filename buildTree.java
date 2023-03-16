// Leetcode - 106
/*
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return createTree(inorder, postorder, 0, n-1, 0, n-1);

    }
    TreeNode createTree(int[] inorder, int[] postorder, int is, int ie, int ps, int pe){
        if(is>ie){
            return null;
        }
        int rootdata = postorder[pe];
        int ri = -1;
        for(int i = is;i<=ie;i++){
            if(inorder[i] == rootdata){
                ri = i;
                break;
            }
        }

        int lis = is;
        int lie = ri-1;
        int ris = ri +1;
        int rie = ie;
        int lps = ps;
        int lpe = lie-lis+lps;
        int rps = lpe+1;
        int rpe = pe -1;

        TreeNode root = new TreeNode(rootdata);
        root.left = createTree(inorder, postorder, lis, lie, lps, lpe);
        root.right = createTree(inorder, postorder, ris, rie, rps, rpe);
        return root;
    }
}