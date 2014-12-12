package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
    	Stack<TreeNode> stack=new Stack<>();
    	List<TreeNode> temp=new ArrayList<>();
        boolean isSym=true;
        if(root==null)
        	return true;
        if(root.left==null&&root.right==null)
        	return true;

        stack.add(root);
        while(!stack.isEmpty())
        {
        	temp.clear();
        	TreeNode top=null;
        	while(!stack.isEmpty())
        	{
        		top=stack.pop();
        		temp.add(top.left);
        	    temp.add(top.right);
        	}
        	for(int i=0,j=temp.size()-1;i<j;i++,j--)
        	{
        		if(temp.get(i)==null&&temp.get(j)==null)
        		{
        			isSym=true;
        		}
        		else if(temp.get(i)!=null&&temp.get(j)!=null)
        		{
        			if(temp.get(i).val==temp.get(j).val)
        			{
        				isSym=true;
        				continue;
        			}
        			else {
						return false;
					}
        		}
        		else {
            		return false;
				}
        		
        	}
        	stack.clear();
        	for(int i=0;i<temp.size();i++)
        	{
        		if(temp.get(i)!=null)
        			stack.add(temp.get(i));
        	}
        }
        return isSym;
    }
}
