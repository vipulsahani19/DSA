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
    void inorder(TreeNode root,ArrayList<TreeNode> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
    }

    public TreeNode convertBST(TreeNode root) {
        if(root==null) return root;
        ArrayList<TreeNode> arr=new ArrayList<>();
        inorder(root,arr);
        Collections.reverse(arr);
        int sum=arr.get(0).val;
        for(int i=1;i<arr.size();i++){
            int val=arr.get(i).val;
            sum+=val;
            arr.get(i).val=sum;
        }return root;
    }
}