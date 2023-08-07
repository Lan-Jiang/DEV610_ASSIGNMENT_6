class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class BinaryTree {
    BinaryTree left;
    BinaryTree right;
    Object value;
}

public class ch17ex11_numberNodes {
    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public int numberNodes() {
        return numberNodes(root, 1);
    }

    private int numberNodes(TreeNode node, int count) {
        if (node == null) {
            return count;
        }

        node.val = count;
        count++;

        count = numberNodes(node.left, count);
        count = numberNodes(node.right, count);

        return count;
    }

}
