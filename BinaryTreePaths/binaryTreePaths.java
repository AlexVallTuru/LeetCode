//package BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

    }

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        TreePath(root, "", result);

        return result;
    }


    private void TreePath(TreeNode root, String path, List<String> result){

        if(root.right == null && root.left == null){
            if (path.isEmpty()) {
                path = String.valueOf(root.val);
            } else {
                path = path + "->" + root.val;
            }
            result.add(path);
            return;
        }

        if (path.isEmpty()) {
            path = String.valueOf(root.val);
        } else {
            path = path + "->" + root.val;
        }
        
        if(root.right != null){
            TreePath(root.right, path, result);
        }
        if(root.left != null){
            TreePath(root.left, path, result);
        }

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
