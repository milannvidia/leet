import java.util.ArrayList;
import java.util.List;

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
    List<String> glob = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        rec(root, "");
        return glob;
    }

    public void rec(TreeNode root, String curr) {
        String next;
        if (!curr.isEmpty()) {
            next = curr.concat("->" + Integer.toString(root.val));
        } else {
            next = curr.concat(Integer.toString(root.val));
        }
        if (root.left == null && root.right == null) {
            this.glob.add(next);
            return;
        }
        if (root.left != null)
            rec(root.left, next);
        if (root.right != null)
            rec(root.right, next);
    }
}