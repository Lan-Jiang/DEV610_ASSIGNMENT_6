// public class IntTree {
//     public class IntTreeNode {
//         public int data;
//         public IntTreeNode left;
//         public IntTreeNode right;

//         // constructs a leaf node with given data
//         public IntTreeNode(int data) {
//             this(data, null, null);
//         }

//         public IntTreeNode( data, IntTreeNode left, IntTreeNode right) {
//             this.data = data;
//             this.left = left;
//             this.right = right;
//         }
//     }
// }

public class ch17ex1_countLefNodes {
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);

        int leftCount = countLeftNodes(root);
        System.out.println("Number of left children: " + leftCount);
    }

    private IntTreeNode overallRoot;

    public int countLeftNodes() {
        return countLeftNodes(overallRoot);
    }

    private int countLeftNodes(IntTreeNode node) {
        if(node == null)
            return 0;

        int count = countLeftNodes(node.right);

        if(node.left != null)
            count += 1 + countLeftNodes(node.left);

        return count;
    }
}
