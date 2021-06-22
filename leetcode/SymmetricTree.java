package leetcode;
import java.util.*;

public class SymmetricTree {
	
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
	
	public boolean isSymmetric(TreeNode root) {
        TreeNode cur1 = root, cur2 = root;
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        s1.add(cur1);
        s2.add(cur2);
        while (!s1.isEmpty() && !s2.isEmpty()){
            cur1 = s1.pop();
            cur2 = s2.pop();
            
            if (cur1.val != cur2.val)
                return false;
            
            if (cur1.left != null && cur2.right != null){
                s1.add(cur1.left);
                s2.add(cur2.right);
            }
            else if (cur1.left != null || cur2.right != null)
                return false;
            
            if (cur1.right != null && cur2.left != null){
                s1.add(cur1.right);
                s2.add(cur2.left);
            }
            else if (cur1.right != null || cur2.left != null)
                return false;
            
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
