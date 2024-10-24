//package flipEquivalentBinaryTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class flipEquivalentBinaryTrees {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

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

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 != null || root1 != null && root2 == null) {
            return false;
        }
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1.val != root2.val) {
            return false;
        }
        
        return flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right) || (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));

    }

}
