class Solution {

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        dfs(root, "", result);

        return result;
    }

    private void dfs(TreeNode root, String path, List<String> result) {

        if (root == null) {
            return;
        }

        // Add current node
        if (path.equals("")) {
            path = String.valueOf(root.val);
        } else {
            path = path + "->" + root.val;
        }

        // If leaf, store the path
        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }

        // Go left and right
        dfs(root.left, path, result);
        dfs(root.right, path, result);
    }
}