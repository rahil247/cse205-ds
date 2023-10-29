import javax.swing.tree.TreeNode;

public class Q543 {
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
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null ){
            return 0;
        }

        int d1 = diameterOfBinaryTree(root.left);
        int d2 = diameterOfBinaryTree(root.right);
        int d3 = height(root.left) + height(root.right) ;
        return Math.max(d3, Math.max(d1,d2));
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }
}
}
