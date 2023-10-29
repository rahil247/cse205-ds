import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Q199 {
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
    int depth = 0;
    List<Integer> ans = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)
            return ans;
        
        depth++;
        
        if (ans.size() < depth)
            ans.add(root.val);
        
        ans = rightSideView(root.right);
        ans = rightSideView(root.left);
        
        depth--;
        
        return ans;
    }
    
}
}
