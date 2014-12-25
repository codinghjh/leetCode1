package leetCode;

import java.util.Stack;

public class Majority_Element {
    public int majorityElement(int[] num) {
        Stack<Integer> stack=new Stack<>();
        stack.push(num[0]);
        for(int i=1;i<num.length;i++)
        {
        	if(stack.isEmpty()||stack.peek()==num[i])
        		stack.push(num[i]);
        	else {
				stack.pop();
			}
        }
        return stack.pop();
    }
}
