package leetCode;

public class Palindrome_Number {
    public boolean isPalindrome(int x) {
    	if(x==0)
    		return true;
    	if(x<0||x>=2147483647)
    		return false;
        boolean isPali=true;
        int n=0;
        while((x/(int)Math.pow(10, n))!=0)
        {
        	n++;
        }
        if(n==2)
        {
        	if(x%10!=x/10)
        		return false;
        }
        int i=1;
        while(i<n-i)
        {
        	if(x/(int)Math.pow(10, n-1)==x%(int)Math.pow(10, 1))
        	{
        		x=(x%(int)Math.pow(10, n-1))/(int)Math.pow(10, 1);
        		n=n-2;
        	}
        	else {
				isPali=false;
				break;
			}
        }
        return isPali;
    }
}
