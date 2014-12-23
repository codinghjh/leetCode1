package leetCode;

public class Plus_One {
    public int[] plusOne(int[] digits) {
        if(digits.length==0)
        {
        	int[] plus=new int[1];
        	plus[0]=1;
        	return plus;
        }
        else {
        	boolean isNeedAdd=true;
        	for(int i=0;i<digits.length;i++)
        	{
        		if(digits[i]!=9)
        		{
        			isNeedAdd=false;
        			break;
        		}
        	}
        	if(isNeedAdd)
        	{
        		int[] plus=new int[digits.length+1];
        		plus[0]=1;
        		return plus;
        	}
        	else {
        		for(int i=digits.length-1;i>=0;i--)
    			{
    				if(digits[i]!=9)
    				{
    					digits[i]=digits[i]+1;
    					for(int j=i+1;j<digits.length;j++)
    					{
    						digits[j]=0;
    					}
    					break;
    				}
    			}
        		return digits;
			}
			
		}
    }
}
