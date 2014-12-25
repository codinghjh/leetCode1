package leetCode;

import java.util.ArrayList;

public class ZigZag_Conversion {
    public String convert(String s, int nRows) {
    	ArrayList<StringBuilder> zig=new ArrayList<>();
    	if(nRows==0||nRows==1)
    		return s;
    	int direct=0;
    	for(int i=0;i<nRows;i++)
    	{
    		StringBuilder builder=new StringBuilder();
    		zig.add(builder);
    	}
        int i=0;
        int j=0;
        while(i<s.length())
        {
        	if(direct==0)
        	{
        		for(;i<s.length()&&j<zig.size();i++,j++)
        		{
        			zig.get(j).append(s.substring(i, i+1));
        		}
        		direct=1;
        		j=zig.size()-2;
        	}
        	else {
				for(;i<s.length()&&j>=0;i++,j--)
				{
					zig.get(j).append(s.substring(i,i+1));
				}
				direct=0;
				j=1;
			}
        }
        StringBuilder result=new StringBuilder();
        for(i=0;i<zig.size();i++)
        {
        	result.append(zig.get(i));
        }
        return result.toString();
    }
}
