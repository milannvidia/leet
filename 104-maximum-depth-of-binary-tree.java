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
    public int maxDepth(TreeNode root) {
        return getDepth(root, 0);
    }

    public int getDepth(TreeNode root, int depth) {
        if (root == null)
            return depth;
        return Integer.max(getDepth(root.left, depth + 1), getDepth(root.right, depth + 1));
    }
}