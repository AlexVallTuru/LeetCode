import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import pathSum.TreeNode;

public class largestSumBinaryTree {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

    }

    public long kthLargestLevelSum(TreeNode root, int k) {

        List<Long> sums = new ArrayList<>();

        deepTreeSums(root, 0, sums);

        sums.sort((n1, n2) -> Long.compare(n2, n1));

        if (k - 1 < sums.size()) {
            return sums.get(k - 1);
        } else {
            return -1;
        }
    }

    public void deepTreeSums(TreeNode root, int index, List<Long> sums) {

        if (root == null) {
            return;
        }

        if (index == sums.size()) {
            sums.add(0L);
        }

        sums.set(index, sums.get(index) + root.val);

        deepTreeSums(root.left, index + 1, sums);
        deepTreeSums(root.right, index + 1, sums);
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