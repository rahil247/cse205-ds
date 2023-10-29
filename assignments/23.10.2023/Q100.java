import javax.swing.tree.TreeNode;

public class Q100 {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: if both trees are null, they are identical
        if (p == null || q == null) {
            return p == q;
        }
        // If only one tree is null or the values are different, they are not identical
        // if (p == null || q == null || p.val != q.val) {
        //     return false;
        // }
        // Recursively check if the left and right subtrees are identical
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
}
