package leetcode;

public class MaxDepth {
	
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
	
	public int maxDepth(TreeNode root) {
        return helper(root, 0);
    }
    public int helper(TreeNode node, int depth){
        if (node == null)
            return depth;
        int depthL = helper(node.left, depth+1);
        int depthR = helper(node.right, depth+1);
        int max = Math.max(depthL, depthR);
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
