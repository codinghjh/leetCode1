package leetCode;

public class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
    	int length=0;
        if(s.length()==0)
        	return 0;
        for(int i=s.length()-1;i>=0;i--)
        {
        	if(s.charAt(i)!=' ')
        		length++;
        	else {
        		if(length!=0)
        			break;
        		else if(i>0)
				{
					length=0;
				}
			}
        }
        return length;
    }
}
