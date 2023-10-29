import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Q102 {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> level = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root==null){
            return level;
        }

        q.add(root);

        while(!q.isEmpty()) {
			int levelSize = q.size();
			List<Integer> currLevel = new ArrayList<>();
			for(int i = 0; i < levelSize; i++) {
				TreeNode currNode = q.poll();
				currLevel.add(currNode.val);
				if (currNode.left != null)
					q.add(currNode.left);
				if (currNode.right != null)
					q.add(currNode.right);
			}
			level.add(currLevel);
		}
		return level;

    }
}
}
