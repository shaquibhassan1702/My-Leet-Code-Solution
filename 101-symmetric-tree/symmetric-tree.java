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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode node1, TreeNode node2) {
        // If both are null, they are symmetric
        if (node1 == null && node2 == null) return true;
        
        // If only one is null or values don't match, they aren't symmetric
        if (node1 == null || node2 == null || node1.val != node2.val) return false;

        // Recursively check outer and inner pairs
        return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }
}