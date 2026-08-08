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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=new TreeNode(nums[0]);
        if(nums.length==1) return root;
        return build(nums,0,nums.length-1);

    }
    static TreeNode build(int[] nums,int ilo,int ihi){
        if(ilo>ihi) return null;
        int idx=(ilo+ihi)/2;
        TreeNode root=new TreeNode(nums[idx]);
        root.left=build(nums,ilo,idx-1);
        root.right=build(nums,idx+1,ihi);
        return root;

    }
}