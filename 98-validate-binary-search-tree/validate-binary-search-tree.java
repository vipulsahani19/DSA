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
    // static boolean flag=true;
    // long maxleft(TreeNode root){
    //     if(root==null) return Long.MIN_VALUE;
    //     long left=maxleft(root.left);
    //     long right=maxleft(root.right);
    //     return Math.max(root.val,Math.max(left,right));
    // }
    // long minright(TreeNode root){
    //     if(root==null) return Long.MAX_VALUE;
    //     long left=minright(root.left);
    //     long right=minright(root.right);
    //     return Math.min(root.val,Math.min(left,right));
    // }
    // void helper(TreeNode root){
    //     if(root==null) return;
    //     long max=maxleft(root.left);
    //     long min=minright(root.right);
    //     if(max>=root.val || min<=root.val) flag=false;
    //     helper(root.left);
    //     helper(root.right);
    // }
    boolean helper(TreeNode root,long min,long max){
        if(root==null) return true;
        if(min>=root.val || root.val>=max) return false;
        return helper(root.left,min,root.val) && helper(root.right,root.val,max); 
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}