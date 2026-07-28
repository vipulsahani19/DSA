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
    int dia=0;
     int level(TreeNode root){
        if(root==null) return 0;
        int lh=level(root.left);
        int rh=level(root.right);
        dia=Math.max(dia,lh+rh);
        return 1+ Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        level(root);
        return dia;
    }
}