package leetCode;
import java.util.Stack;
public class MinStack {
	Stack<Integer> stack=new Stack<>();
	Stack<Integer> minStack=new Stack<>();
	 public void push(int x) {
	        if(stack.isEmpty()||x<=minStack.peek())
	        {
	        	minStack.push(x);
	        }
	        stack.push(x);
	    }
	    public void pop() {
	        if(stack.peek().equals(minStack.peek()))
	        {
	        	minStack.pop();
	        }
	        stack.pop();
	    }
	    public int top() {
	    	return stack.peek();      
	    }

	    public int getMin() {
	    	return minStack.peek();
	    }

}
