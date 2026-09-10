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

        return checkMirror(root.left, root.right);
    }

    public boolean checkMirror(TreeNode left, TreeNode right) {

        // Both are empty
        if (left == null && right == null) {
            return true;
        }

        // One is empty
        if (left == null || right == null) {
            return false;
        }

        // Values are different
        if (left.val != right.val) {
            return false;
        }

        // Compare opposite sides
        return checkMirror(left.left, right.right)
                && checkMirror(left.right, right.left);
    }
}
    