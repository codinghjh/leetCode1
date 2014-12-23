package leetCode;

public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)
          return "";
        String longest="";
        String common="";
        String string0=strs[0];
        for(int i=0;i<string0.length();i++)
        {
        	common=string0.substring(0,i+1);
        	for(String temp:strs)
        	{
        		if(temp.indexOf(common)!=0)
        		{
        			return longest;
        		}
        		
        	}
        	longest=common;
        }
        return longest;
    }
}
