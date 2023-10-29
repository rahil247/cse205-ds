import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Q94 {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> in = new ArrayList<Integer>();

        if(root==null){
            return in;
        }

        in.addAll(inorderTraversal(root.left));
        in.add(root.val);
        in.addAll(inorderTraversal(root.right));

        return in;
    }
}
}
