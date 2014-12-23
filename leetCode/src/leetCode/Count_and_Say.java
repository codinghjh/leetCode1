package leetCode;

public class Count_and_Say {
    public String countAndSay(int n) {
        StringBuilder temp=new StringBuilder();
        StringBuilder result=new StringBuilder();
        result.append(1);
        String preValue="";
        int count=0;
        for(int i=1;i<n;i++)
        {
        	temp.setLength(0);
        	temp.append(result);
        	result.setLength(0);
        	preValue=temp.substring(0, 1);
        	count=0;
        	for(int j=0;j<temp.length();j++)
        	{
        		if(temp.substring(j, j+1).equals(preValue))
        		{
        			count++;
        		}
        		else {
        			result.append(count);
					result.append(preValue);
					preValue=temp.substring(j,j+1);
					count=1;
				}
        	}
        	result.append(count);
			result.append(preValue);
			count=0;
        	
        }
        return result.toString();
    }
}
