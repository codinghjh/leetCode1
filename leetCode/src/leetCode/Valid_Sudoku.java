package leetCode;

import java.util.ArrayList;

public class Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean isValid=true;
        int colum=board[0].length;
        int row=board.length;
        ArrayList<Character> appeared=new ArrayList<>();
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<colum;j++)
        	{
        		if(board[i][j]!='.')
        		{
        			if(appeared.contains(board[i][j]))
        				return false;
        			else {
						appeared.add(board[i][j]);
					}
        		}
        	}
        	appeared.clear();
        }
        appeared.clear();
        for(int i=0;i<colum;i++)
        {
        	for(int j=0;j<row;j++)
        	{
        		if(board[j][i]!='.')
        		{
        			if(appeared.contains(board[j][i]))
        				return false;
        			else {
						appeared.add(board[j][i]);
					}
        		}
        	}
        	appeared.clear();
        }
        appeared.clear();
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		for(int k=0;k<3;k++)
        		{
        			for(int l=0;l<3;l++)
        			{
//        				int curRow=l+i*3;
//        				int curColum=k+j*3;
        				if(board[l+i*3][k+j*3]!='.')
        				{
        					if(appeared.contains(board[l+i*3][k+j*3]))
                				return false;
                			else {
        						appeared.add(board[l+i*3][k+j*3]);
        					}
        				}
        			}
        			
        		}
        		appeared.clear();
        	}
        }
        return isValid;
    }
}
