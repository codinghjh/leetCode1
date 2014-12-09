package leetCode;

public class Valid_Palindrome {
	public static void main(String[] args) {
		String s="ab2a";
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
      
        boolean isPal=true;
        if(s==null||s.equals(""))
        	return true;
        char front=' ';
        char end=' ';
        int i=0;
        int j=s.length()-1;
        int tag=0;
       while(i<j)
       {
    	   while(i<=j)
    	   {
    		   if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)<='9'&&s.charAt(i)>='0')
        	   {
        		   front=s.charAt(i);
        		   tag++;
        		   break;
        	   }
    		   else {
				i++;
			}
    	   }
    	   while(i<=j)
    	   {
    		   if(s.charAt(j)>='a'&&s.charAt(j)<='z'||s.charAt(j)>='A'&&s.charAt(j)<='Z'||s.charAt(j)<='9'&&s.charAt(j)>='0')
        	   {
        		   end=s.charAt(j);
        		   tag++;
        		   break;
        	   }
    		   else {
    			   j--;
			}
    	   }
    	   if(tag<2)
    		   return true;
    	   if(!(String.valueOf(front).toLowerCase().equals(String.valueOf(end).toLowerCase())))
    	   {
    		   isPal=false;
    		   break;
    	   }
    	   i++;
    	   j--;
       }
       return isPal; 
    }
}
