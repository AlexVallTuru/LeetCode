//package PathSum;

import javax.swing.tree.TreeNode;

public class pathSum {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) return false;

        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }

        int result = targetSum - root.val;

        return hasPathSum(root.left, result) || hasPathSum(root.right, result);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
