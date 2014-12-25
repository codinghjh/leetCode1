package leetCode;

public class String_to_Integer_atoi {
    public int atoi(String str) {
        long x=0;
        boolean isNegative=false;
        boolean isFind=false;
        if(str==null||str.length()==0)
        	return (int)x;
        int length=0;
        for(int i=0;i<str.length();i++)
        {
        	if((str.substring(i, i+1).equals(" "))&&!isFind)
        	{
        	}
        	else if(str.substring(i,i+1).equals("+"))
        	{
        		if(str.length()<i+2||!((str.charAt(i+1)>='0')&&str.charAt(i+1)<='9'))
        			return 0;
        	}
        	else if(str.substring(i, i+1).equals("-"))
        	{
        		if(str.length()<i+2||!((str.charAt(i+1)>='0')&&str.charAt(i+1)<='9'))
        			return 0;
        		isNegative=true;
        	}
        	else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
        	{
        		length++;
        		isFind=true;
        		x=x*10+Integer.parseInt(str.substring(i, i+1));
        	}
        	else {
				break;
			}
        }
        if(isNegative)
        {
        	x=0-x;
        }
        if(length>10)
        {
        	if(isNegative)
        		return -2147483648;
        	else {
        		return 2147483647;
			}
        }
        if(x>=2147483647)
        	return 2147483647;
        if(x<=-2147483648)
        		return -2147483648;
        return (int)x;
    }
}
