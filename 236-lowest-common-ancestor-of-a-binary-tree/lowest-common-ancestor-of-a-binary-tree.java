/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static boolean isexists(TreeNode root,TreeNode p){
        if(root==null) return false;
        if(root==p) return true;
        return isexists(root.left,p) || isexists(root.right,p);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        if(root==p || root==q) return root;
        if(root.left==p && root.right==q) return root;
        boolean pleft=isexists(root.left,p);
        boolean qleft=isexists(root.left,q);
        if(pleft && qleft) return lowestCommonAncestor(root.left,p,q);
        else if(!pleft && !qleft) return lowestCommonAncestor(root.right,p,q);
        else return root;
    }
}