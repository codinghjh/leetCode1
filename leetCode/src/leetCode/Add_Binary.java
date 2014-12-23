package leetCode;


public class Add_Binary {
    public String addBinary(String a, String b) {
    	if(a.length()<b.length())
    		return addBinary(b, a);
        StringBuilder builder=new StringBuilder();
        int carry=0,result=0;
        int ia=0,ib=0;
        for(int i=b.length()-1,j=a.length()-1;i>=0&&j>=0;i--,j--)
        {
        	ia=Integer.parseInt(a.substring(j,j+1));
        	ib=Integer.parseInt(b.substring(i,i+1));
        	
        	result=(carry+ia+ib)%2;
        	carry=(carry+ia+ib)/2;
        	builder.append(result+"");
        }
        for(int j=a.length()-b.length()-1;j>=0;j--)
        {
        	ia=Integer.parseInt(a.substring(j,j+1));
        	result=(carry+ia)%2;
        	carry=(carry+ia)/2;
        	builder.append(result+"");
        }
        if(carry==1)
        	builder.append("1");
        return builder.reverse().toString();
        
    }
}
