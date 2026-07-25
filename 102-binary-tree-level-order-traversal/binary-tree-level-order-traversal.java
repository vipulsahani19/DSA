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
 class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node,int level){
       this.node=node;
       this.level=level;
    }
 }
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>(); 
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Pair> q=new LinkedList<>();
        List<Integer> temp=new ArrayList<>();
        int currlevel=0;
        q.add(new Pair(root,0));
        temp.add(root.val);
        while(q.size()>0){
            Pair front=q.remove();
            if(front.level!=currlevel){
                currlevel++;
                ans.add(temp);
                temp =new ArrayList<>();
            }
            if(front.node.left!=null) q.add(new Pair(front.node.left,front.level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right,front.level+1));
            if(currlevel!=0){
                temp.add(front.node.val);
            }
        }
        ans.add(temp);
        return ans;
    }
}