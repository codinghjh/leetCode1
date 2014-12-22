package leetCode;

public class Balanced_Binary_Tree {
    public boolean isBalanced(TreeNode root) {
       boolean isBalan=false;
       if(root==null)
    	   return true;
       if(root.left==null&&root.right==null)
    	   isBalan= true;
       if(root.left!=null&&root.right!=null)
       {
    	   if(Math.abs(Depth(root.left)-Depth(root.right))<=1&&isBalanced(root.left)&&isBalanced(root.right))
    	   {
    		   isBalan=true;
    	   }
    	   else 
    	   {
			isBalan=false;
			}
       }
       if(root.left==null&&root.right!=null)
       {
    	   if(Depth(root.right)<=1&&isBalanced(root.right))
    		   isBalan=true;
    	   else {
			isBalan=false;
		}
       }
       if(root.right==null&&root.left!=null)
       {
    	   if(Depth(root.left)<=1&&isBalanced(root.left))
    		   isBalan=true;
    	   else {
			isBalan=false;
		}
       }
    	return isBalan;   
    }
    public int Depth(TreeNode root) {
		    int dep=0;
	        if(root==null)
	        	return 0;
	        if(root.left!=null&&root.right!=null)
	        	dep=Math.max(Depth(root.right), Depth(root.left))+1;
	        if(root.left==null&&root.right!=null)
	        	dep=Depth(root.right)+1;
	        if(root.left!=null&&root.right==null)
	        	dep=Depth(root.left)+1;
	        if(root.right==null&&root.left==null)
	        	dep=1;
	        return dep;
	    }
}
