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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 1. Base case: If the tree is empty, there's no path
        if (root == null) {
            return false;
        }

        // 2. Leaf node check: If current node is a leaf, 
        // check if its value matches the remaining targetSum
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        // 3. Recursive step: Check subtrees with updated targetSum
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) || 
               hasPathSum(root.right, remainingSum);
    }
}