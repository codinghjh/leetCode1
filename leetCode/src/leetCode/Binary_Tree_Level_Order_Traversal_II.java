package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Binary_Tree_Level_Order_Traversal_II {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<TreeNode> parent=new ArrayList<TreeNode>();
    	List<TreeNode> child=new ArrayList<>();
    	List<List<Integer>> result=new LinkedList<>();
    	if(root==null)
    		return result;
    	parent.add(root);
    	child.addAll(parent);
    	while(child.size()!=0)
    	{
    		child.clear();
    		List<Integer> list=new LinkedList<>();
    		for(TreeNode node:parent)
    		{
    			if(node.left!=null)
    				child.add(node.left);
    			if(node.right!=null)
    				child.add(node.right);
    			
    			list.add(node.val);
    		}
    		result.add(0,list);
    		parent.clear();
    		parent.addAll(child);
    	}
    	
        return result;
    }
}
