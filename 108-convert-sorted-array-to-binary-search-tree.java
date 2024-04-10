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
    public TreeNode sortedArrayToBST(int[] nums) {
        return recursion(nums, 0, nums.length - 1);
    }

    public TreeNode recursion(int[] nums, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;

        TreeNode current = new TreeNode(
                nums[mid],
                recursion(nums, start, mid - 1),
                recursion(nums, mid + 1, end));
        return current;
    }
}