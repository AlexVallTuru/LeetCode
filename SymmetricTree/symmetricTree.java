import java.util.LinkedList;
import java.util.Queue;

public class symmetricTree {

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

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            
            TreeNode nodeLeft = queue.poll();
            TreeNode nodeRight = queue.poll();

            if (nodeLeft == null && nodeRight == null) {
                return false;                
            }

            if(nodeLeft == null || nodeRight == null || nodeLeft.val != nodeRight.val ){
                return false;
            }

            queue.add(nodeLeft.left);
            queue.add(nodeRight.right);
            queue.add(nodeLeft.right);
            queue.add(nodeRight.left);

        }

        return true;
    }

}