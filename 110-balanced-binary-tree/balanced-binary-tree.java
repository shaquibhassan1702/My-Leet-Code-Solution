/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        // If the helper returns -1, the tree is unbalanced
        return getHeight(root) != -1;
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Check left subtree
        int leftHeight = getHeight(node.left);
        if (leftHeight == -1) return -1;

        // Check right subtree
        int rightHeight = getHeight(node.right);
        if (rightHeight == -1) return -1;

        // If the difference between heights is > 1, it's unbalanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        // Otherwise, return the actual height of this node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}