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

public class ch17ex20_makePerfect {
    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public void makePerfect() {
        int height = getHeight(root);
        root = makePerfect(root, 1, height);
    }

    private TreeNode makePerfect(TreeNode node, int currentHeight, int targetHeight) {
        if (currentHeight > targetHeight) {
            return null;
        }

        if (node == null) {
            node = new TreeNode(0);
        }

        node.left = makePerfect(node.left, currentHeight + 1, targetHeight);
        node.right = makePerfect(node.right, currentHeight + 1, targetHeight);

        return node;
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

}
