import java.util.ArrayDeque;

import javax.swing.tree.TreeNode;

public class Q105 {
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode root = new TreeNode(preorder[0]);
        int inorderIndex = 0;
        stack.push(root);
        
        for(int i = 1; i < preorder.length; i++){
            TreeNode prev = null;
            while(!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]){
                prev = stack.pop();
                inorderIndex++;
            }
            TreeNode toInsert = new TreeNode(preorder[i]);
            if(prev == null){
                prev = stack.peek();
                prev.left = toInsert;
            }
            else{
                prev.right = toInsert;
            }
            stack.push(toInsert);
        }
        return root;
    }
}
}
