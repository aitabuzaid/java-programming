package leetcode;

import java.util.*;

public class IsValidBST {

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

	public boolean isValidBST(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		Set<TreeNode> visited = new HashSet<>();
		TreeNode node;
		Integer lastVal = null;
		stack.push(root);
		visited.add(root);
		while (!stack.isEmpty()){
			node = stack.peek();
			if (node.left != null && !visited.contains(node.left)){
				stack.push(node.left);
				visited.add(node.left);
			}
			else{
				node = stack.pop();
				if(lastVal == null)
					lastVal = node.val;
				else{
					if(lastVal >= node.val)
						return false;
					else
						lastVal = node.val;
				}
				if (node.right != null && !visited.contains(node.right)){
					stack.push(node.right);
					visited.add(node.right);
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
