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
 * }Tree
 */
class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node,int level){
        this.node=node;
        this.level=level;
    }
}
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        List<Integer> temp=new ArrayList<>();
        Queue<Pair> q=new LinkedList<>();

        q.add(new Pair(root,0));
        int currlevel=0;
        while(!q.isEmpty()){
            Pair front=q.remove();
            if(front.level!=currlevel){
                ans.add(temp);
                temp=new ArrayList<>();
                currlevel=front.level;
            }
            if(currlevel % 2 == 0)
                temp.add(front.node.val);
            else
                temp.add(0, front.node.val); 
            if(front.node.left!=null) q.add(new Pair(front.node.left, front.level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right, front.level+1));
            
        }
        ans.add(temp);
        return ans;
    }
    
}