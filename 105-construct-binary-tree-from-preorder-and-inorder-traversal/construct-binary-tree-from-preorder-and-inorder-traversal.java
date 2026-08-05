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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return build(preorder,inorder,0,n-1,0,n-1);
    }
    static TreeNode build(int[] preorder,int[] inorder,int plo,int phi,int ilo,int ihi){
        if(plo>phi || ilo>ihi) return null;
        int val=preorder[plo];
        TreeNode root=new TreeNode(val);
        int r=0;
        for(int i=ilo;i<=ihi;i++){
            if(inorder[i]==val){
                r=i;
                break;
            }
        }
        int cnt=r-ilo;
        root.left=build(preorder,inorder,plo+1,plo+cnt,ilo,r-1);
        root.right=build(preorder,inorder,plo+cnt+1,phi,r+1,ihi);
        return root;
    }
}