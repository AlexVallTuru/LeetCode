package PathSumll;

import java.util.ArrayList;
import java.util.List;

public class pathSumll {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> listOfList = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();

        findPaths(root, targetSum, listInteger, listOfList);

        return listOfList;
    }

    private static void findPaths(TreeNode root, int targetSum, List<Integer> actualPath,
            List<List<Integer>> listOfList) {

        if(root == null) {
            return;
        }

        actualPath.add(root.val);

        if(root.left == null && root.right == null && root.val == targetSum){
            listOfList.add(new ArrayList<>(actualPath));
        } else {
            findPaths(root.left, targetSum - root.val, actualPath, listOfList);
            findPaths(root.right, targetSum - root.val , actualPath, listOfList);
        }

        actualPath.remove(actualPath.size() -1);

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
