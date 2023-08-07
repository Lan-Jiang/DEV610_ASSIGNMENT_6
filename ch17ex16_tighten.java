class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class ch17ex16_tighten {
    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public void tighten() {
        root = tighten(root);
    }

    private TreeNode tighten(TreeNode node) {
        if (node == null) {
            return null;
        }

        node.left = tighten(node.left);
        node.right = tighten(node.right);

        if (node.left == null && node.right != null) {
            return node.right;
        }
        if (node.left != null && node.right == null) {
            return node.left;
        }

        return node;
    }

}
