// LeetCode - 102

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        dfs(res,root,0);
        return res;
    }
    public void dfs(List<List<Integer>> list,TreeNode node,int deep){
        if(node==null)return;
        if(list.size()==deep)
            list.add(new ArrayList<Integer>());
        list.get(deep).add(node.val);
        dfs(list, node.left, deep+1);
        dfs(list, node.right, deep+1);   
    }
}