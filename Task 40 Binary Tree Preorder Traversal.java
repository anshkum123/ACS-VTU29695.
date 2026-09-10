import java.util.*;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode current = stack.pop();

            result.add(current.val);

            // Right first
            if (current.right != null) {
                stack.push(current.right);
            }

            // Left second
            if (current.left != null) {
                stack.push(current.left);
            }
        }

        return result;
    }
}