package leetCode;

public class Climbing_Stairs {
	public static void main(String[] args) {
		System.out.println(new Climbing_Stairs().climbStairs(44));
	}
    public int climbStairs(int n) {
    	int step=0;
        int[] steps=new int[n+1];
       
        if(n==1)
        	step=1;
        else if(n==2){
			step=2;
		}
        else {
        	 steps[0]=0;
             steps[1]=1;
             steps[2]=2;
			for(int i=3;i<n+1;i++)
			{
				steps[i]=steps[i-1]+steps[i-2];
			}
			step=steps[n];
		}
        
        return step;
    }
}
