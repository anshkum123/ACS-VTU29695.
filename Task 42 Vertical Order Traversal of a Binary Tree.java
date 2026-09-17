class Solution {

    class Pair {
        TreeNode node;
        int row;
        int col;

        Pair(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<Pair> nodes = new ArrayList<>();

        dfs(root, 0, 0, nodes);

        Collections.sort(nodes, (a, b) -> {

            if (a.col != b.col) {
                return Integer.compare(a.col, b.col);
            }

            if (a.row != b.row) {
                return Integer.compare(a.row, b.row);
            }

            return Integer.compare(a.node.val, b.node.val);
        });

        List<List<Integer>> result = new ArrayList<>();

        int previousColumn = Integer.MIN_VALUE;

        for (Pair p : nodes) {

            if (p.col != previousColumn) {
                result.add(new ArrayList<>());
                previousColumn = p.col;
            }

            result.get(result.size() - 1).add(p.node.val);
        }

        return result;
    }

    private void dfs(TreeNode root, int row, int col, List<Pair> nodes) {

        if (root == null) {
            return;
        }

        nodes.add(new Pair(root, row, col));

        dfs(root.left, row + 1, col - 1, nodes);

        dfs(root.right, row + 1, col + 1, nodes);
    }
}