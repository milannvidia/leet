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
    public int count = 0;

    public int countNodes(TreeNode root) {
        recursion(root);
        return count;
    }

    public void recursion(TreeNode root) {
        if (root == null)
            return;
        this.count++;
        if (root.left != null)
            recursion(root.left);
        if (root.right != null)
            recursion(root.right);
    }
}