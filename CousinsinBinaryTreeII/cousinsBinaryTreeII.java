import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class cousinsBinaryTreeII {

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

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

    }

    public TreeNode replaceValueInTree(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        root.val = 0;

        while (!queue.isEmpty()) {

            int lenlvlSize = queue.size();
            int lvlSum = 0;

            List<TreeNode> currentLevel = new ArrayList<>();

            // Sumamos todos los hermanos de todo el nivel
            for (int i = 0; i < lenlvlSize; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node);
                if (node.left != null)
                    lvlSum += node.left.val;
                if (node.right != null)
                    lvlSum += node.right.val;
            }
            //Calculos individuales de cada nivel
            for (TreeNode node : currentLevel) {
                int sumSiblins = 0;

                if (node.left != null)
                    sumSiblins += node.left.val;
                if (node.right != null)
                    sumSiblins += node.right.val;

                if (node.left != null) {
                    node.left.val = lvlSum - sumSiblins;
                    queue.add(node.left);
                }
                if (node.right != null) {
                    node.right.val = lvlSum - sumSiblins;
                    queue.add(node.right);
                }
            }
        }
        return root;
    }

}