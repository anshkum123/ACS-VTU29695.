class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Empty tree
        if (root == null) {
            return false;
        }

        // Check if current node is a leaf
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        // Subtract current value and check left/right
        int remaining = targetSum - root.val;

        return hasPathSum(root.left, remaining) ||
               hasPathSum(root.right, remaining);
    }
}