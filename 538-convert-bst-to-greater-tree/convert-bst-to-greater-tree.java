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
    int sum;
    void revinorder(TreeNode root){
        if(root==null) return;
        revinorder(root.right);
        int val=root.val;
        sum+=val;
        root.val=sum;
        revinorder(root.left);
        
    }

    public TreeNode convertBST(TreeNode root) {
        if(root==null) return root;
        revinorder(root);
        return root;
    }
}