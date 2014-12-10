package leetCode;

import java.util.Stack;

class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
public class Path_Sum {
	    public boolean hasPathSum(TreeNode root, int sum) {
	    	boolean isExist=false;
	    	if(root==null)
	    		return false;
	    	if(root.left!=null)
	    	{
	    		isExist=isExist||hasPathSum(root.left, sum-root.val);
	    	}
	    	if(root.right!=null)
	    	{
	    		isExist=isExist||hasPathSum(root.right, sum-root.val);
	    	}
	    	if(root!=null&&root.left==null&&root.right==null)
	    	{
	    		if(sum==root.val)
	    			return true;
	    		else 
					return false;
	    	}
	    	return isExist;
	    }
}
