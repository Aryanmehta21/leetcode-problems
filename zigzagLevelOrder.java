class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> list= new ArrayList<>();

          traversal(root,list,0);

         return list;
    }

    public static void traversal(TreeNode value,List<List<Integer>> list, int level){

        if(value==null){
            return ;

        }

        if(list.size()<=level){
        
        List<Integer> newLevel = new LinkedList<>();
            list.add(newLevel);
        }

        List<Integer> recAns= list.get(level);

        if(level%2==0){
            recAns.add(value.val);
        }
        else{
            recAns.add(0,value.val);
        }

        traversal(value.left,list,level+1);
        traversal(value.right,list,level+1);  
    }
}