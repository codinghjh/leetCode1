package leetCode;

public class Maximum_Depth_of_Binary_Tree {
public int maxDepth(TreeNode root) {
	 int dep=0;
       if(root==null)
       	return 0;
       if(root.left!=null&&root.right!=null)
       	dep=Math.max(maxDepth(root.right), maxDepth(root.left))+1;
       if(root.left==null&&root.right!=null)
       	dep=maxDepth(root.right)+1;
       if(root.left!=null&&root.right==null)
       	dep=maxDepth(root.left)+1;
       if(root.right==null&&root.left==null)
       	dep=1;
       return dep;
   
}

}
