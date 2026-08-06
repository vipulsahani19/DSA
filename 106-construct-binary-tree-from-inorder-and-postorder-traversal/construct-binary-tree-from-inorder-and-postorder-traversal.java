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
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=postorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        return build(inorder,postorder,0,n-1,0,n-1);
    }
    TreeNode build(int []inorder,int[] postorder,int plo,int phi,int ilo,int ihi){
        if(plo>phi || ilo>ihi) return null;
        int val=postorder[phi];
        TreeNode root=new TreeNode(val);
        int r=map.get(val);
        int leftsize=r-ilo;
        root.left=build(inorder,postorder,plo,plo+leftsize-1,ilo,r-1);
        root.right=build(inorder,postorder,plo+leftsize,phi-1,r+1,ihi);
        return root;
    }
}