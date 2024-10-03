package InvertBinaryTree;

public class invertBinaryTree {

    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return null;
        }
        TreeNode temp = new TreeNode();
        temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
