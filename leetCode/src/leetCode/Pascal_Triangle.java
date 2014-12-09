package leetCode;

import java.util.ArrayList;
import java.util.List;
public class Pascal_Triangle {
	public static void main(String[] args) {
		List<Integer> list=getRow(9);
		for(int i:list)
		{
			System.out.print(i);
			System.out.print(" ");
		}
	}
public static List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        int[] old=new int[rowIndex+1];
        for(int i=0;i<rowIndex;i++)
        {
        	for(int k=0;k<list.size();k++)
        	{
        		old[k]=list.get(k);
        	}
        	list.add(0);
        	for(int j=0;j<=i+1;j++)
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
        }
        return list;
    }
}
