class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(root, targetSum, path, result);

        return result;
    }

    private void dfs(TreeNode root, int targetSum,
                     List<Integer> path,
                     List<List<Integer>> result) {

        if (root == null) {
            return;
        }

        // Add current node to path
        path.add(root.val);

        // Check if current node is a leaf
        if (root.left == null && root.right == null) {

            if (targetSum == root.val) {
                result.add(new ArrayList<>(path));
            }
        }

        // Go to left and right
        dfs(root.left, targetSum - root.val, path, result);
        dfs(root.right, targetSum - root.val, path, result);

        // Remove current node before going back
        path.remove(path.size() - 1);
    }
}