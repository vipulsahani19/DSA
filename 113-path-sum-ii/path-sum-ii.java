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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        if(root==null) return ans;
        dfs(root,targetSum,arr,ans);
        return ans;
    }
    static void dfs(TreeNode root,int sum,ArrayList<Integer> arr,List<List<Integer>> ans){
        if(root==null) return;
        arr.add(root.val);
        if(root.left==null && root.right==null && sum-root.val==0){  
            ans.add(new ArrayList<>(arr));
        }
        dfs(root.left,sum-root.val,arr,ans);
        dfs(root.right,sum-root.val,arr,ans);
        arr.remove(arr.size()-1);
    }
}