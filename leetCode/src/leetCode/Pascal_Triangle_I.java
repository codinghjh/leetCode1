package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle_I {
	public static void main(String[] args) {
		List<List<Integer>> result=new ArrayList<>();
		result=generate(5);
		for(List<Integer> temp:result)
		{
			for(int i:temp)
			{
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
public static List<List<Integer>> generate(int numRows) {

	List<Integer> list=new ArrayList<>();
    List<List<Integer>> result=new ArrayList<>();
    list.add(1);
    int[] old=new int[numRows];
    
    for(int i=0;i<numRows;i++)
    {
    	for(int k=0;k<list.size();k++)
    	{
    		old[k]=list.get(k);
    	}
    	
    	for(int j=0;j<=i;j++)
    	{
    		if(j==0)
    		{
    			list.set(0, 1);
    		}
    		else 
    		{
				list.set(j,old[j]+old[j-1]);
			}
    	}
    	List<Integer> temp=new ArrayList<>();
    	temp.addAll(list);
    	result.add(temp);
    	list.add(0);
    }
    return result;

    }
}
