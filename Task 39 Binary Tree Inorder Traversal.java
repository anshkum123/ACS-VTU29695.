import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {

            // Go to the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Get the node
            current = stack.pop();
            result.add(current.val);

            // Move to right
            current = current.right;
        }

        return result;
    }
}