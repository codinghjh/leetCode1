package leetCode;

public class Roman_to_Integer {
    public int romanToInt(String s) {
    	int value=0;
    	if(s==null||s.length()==0)
    		return 0;
    	int[] keys=new int[s.length()];
    	for(int i=0;i<s.length();i++)
    	{
    		keys[i]=getValue(s.substring(i,i+1));
    	}
    	int i=0;
    	while(i!=keys.length)
    	{
    		int key=keys[i];
    		if(((i+1)<keys.length))
    		{
    			if(((keys[i+1])==key))
        		{
        			if(((i+2)<keys.length)&&((keys[i+2])==key))
        			{
        				value=value+key*3;
        				i=i+3;
        			}
        			else {
    					value=value+key*2;
    					i=i+2;
    				}
        		}
    			else {//has next, not equal
					if(((key==1)&&((keys[i+1])==5||keys[i+1]==10))
					   ||((key==10)&&((keys[i+1])==50||keys[i+1]==100))
					   ||((key==100)&&((keys[i+1])==500||(keys[i+1]==1000))))
					{
						value=value+keys[i+1]-key;
						i=i+2;
					}
					else {
						value=value+key;
						i++;
					}
				}
    		}
    		else {
				value=value+key;
				i++;
			}
    	}
    	return value;
    }
    public int getValue(String s)
    {
    	String[] bases={"I","V","X","L","C","D","M"};
    	int[] values={1,5,10,50,100,500,1000};
    	for(int i=0;i<bases.length;i++)
    	{
    		if(bases[i].equals(s))
    			return values[i];
    	}
    	return 0;
    }
}
