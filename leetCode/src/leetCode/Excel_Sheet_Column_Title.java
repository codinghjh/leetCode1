package leetCode;

public class Excel_Sheet_Column_Title {
    public String convertToTitle(int n) {
    	char base='A';
    	if(n==0)
    		return null;
    	StringBuilder builder=new StringBuilder();
    	while(n!=0)
    	{
    		builder.append((char)(((n-1)%26)+base));
    		if(n%26==0&&n>0)
    		{
    			n=n/26;
    			n--;
    		}
    		else {
    			n=n/26;
			}
    	}
    	return builder.reverse().toString();
    }
}
