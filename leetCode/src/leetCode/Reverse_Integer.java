package leetCode;

public class Reverse_Integer {
    public int reverse(int x) {
    	if(x>=-9&&x<=9)
    		return x;
    	long rever=0;
    	StringBuilder reverBuilder=new StringBuilder();
        String str=x+"";
        int i=0;
        if(str.substring(0,1).equals("-"))
        	i=1;
        for(;i<str.length();i++)
        {
        	reverBuilder.append(str.charAt(i));
        }
        rever=Long.parseLong(reverBuilder.reverse().toString());
        if(str.substring(0,1).equals("-"))
        {
        	if(rever>2147483648L)
        		return 0;
        	else {
				return -(int)rever;
			}
        }
        else {
			if(rever>2147483647)
				return 0;
			else {
				return (int)rever;
			}
		}
        	
    }
}
