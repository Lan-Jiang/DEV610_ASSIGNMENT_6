import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class ch17ex5_printLevel  {
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        BinaryTree tree = new BinaryTree(root);
        tree.printLevel(3);
    }

    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public void printLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int currentLevel = 1;
        int nodesInCurrentLevel = 1;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            nodesInCurrentLevel--;

            if (currentLevel == level) {
                System.out.println(node.val);
            }

            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }

            if (nodesInCurrentLevel == 0) {
                nodesInCurrentLevel = queue.size();
                currentLevel++;
            }
        }
    }
}
