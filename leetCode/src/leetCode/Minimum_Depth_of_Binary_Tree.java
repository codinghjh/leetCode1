package leetCode;

public class Minimum_Depth_of_Binary_Tree {
	 public int minDepth(TreeNode root) {
		 int dep=0;
	        if(root==null)
	        	return 0;
	        if(root.left!=null&&root.right!=null)
	        	dep=Math.min(minDepth(root.right), minDepth(root.left))+1;
	        if(root.left==null&&root.right!=null)
	        	dep=minDepth(root.right)+1;
	        if(root.left!=null&&root.right==null)
	        	dep=minDepth(root.left)+1;
	        if(root.right==null&&root.left==null)
	        	dep=1;
	        return dep;
	    }
}
