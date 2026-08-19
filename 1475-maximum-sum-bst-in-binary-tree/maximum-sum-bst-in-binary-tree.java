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

    class Info {
        boolean isBST;
        int min;
        int max;
        int sum;

        Info(boolean isBST, int min, int max, int sum) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }

    int ans = 0;

    Info solve(TreeNode root) {
        if (root == null) {
            return new Info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        Info left = solve(root.left);
        Info right = solve(root.right);

        if (left.isBST && right.isBST &&
            root.val > left.max && root.val < right.min) {

            int sum = left.sum + root.val + right.sum;
            ans = Math.max(ans, sum);

            return new Info(
                true,
                Math.min(root.val, left.min),
                Math.max(root.val, right.max),
                sum
            );
        }

        return new Info(false, 0, 0, 0);
    }

    public int maxSumBST(TreeNode root) {
        solve(root);
        return ans;
    }
}