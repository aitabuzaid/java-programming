package leetcode;
import java.util.*;


public class LevelOrder {
	
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
	
	class TreeNodeLevel{
        TreeNode node;
        int level;
        TreeNodeLevel(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
                return result;
        Queue<TreeNodeLevel> queue = new LinkedList<TreeNodeLevel>();
        queue.add(new TreeNodeLevel(root, 0));
        int reached = -1;
        
        while (!queue.isEmpty()){
            TreeNodeLevel curNode = queue.remove();
            if (curNode.level > reached){
                result.add(curNode.level, new LinkedList<Integer>());
                reached = curNode.level;
            }
            
            result.get(curNode.level).add(curNode.node.val);
            if (curNode.node.left != null)
                queue.add(new TreeNodeLevel(curNode.node.left, curNode.level+1));
            if (curNode.node.right != null)
                queue.add(new TreeNodeLevel(curNode.node.right, curNode.level+1));
        }
        
        
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
