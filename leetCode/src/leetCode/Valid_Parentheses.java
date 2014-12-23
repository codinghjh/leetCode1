package leetCode;

import java.util.Stack;

public class Valid_Parentheses {
    public boolean isValid(String s) {
    	boolean isValid=true;
    	if(s.length()==0)
    		return true;
    	if(s.length()%2==1)
    		return false;
        Stack<String> parenthe=new Stack<>();
        parenthe.push(s.substring(0,1));
        for(int i=1;i<s.length();i++)
        {
        	String c=s.substring(i,i+1);
        	if(c.equals(")"))
        	{
        		if(parenthe.size()==0||!parenthe.peek().equals("("))
        		{
        			return false;
        		}
        		else {
					parenthe.pop();
				}
        	}
        	else if (c.equals("}")) {
        		if(parenthe.size()==0||!parenthe.peek().equals("{"))
        		{
        			return false;
        		}
        		else {
					parenthe.pop();
				}
			}
        	else if (c.equals("]")) {
        		if(parenthe.size()==0||!parenthe.peek().equals("["))
        		{
        			return false;
        		}
        		else {
					parenthe.pop();
				}
			}
        	else {
				parenthe.push(c);
			}
        }
        if(parenthe.size()!=0)
        	isValid=false;
        return isValid;
    }
}
