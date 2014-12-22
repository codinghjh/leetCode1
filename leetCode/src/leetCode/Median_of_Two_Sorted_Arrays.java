package leetCode;

public class Median_of_Two_Sorted_Arrays {
	public static void main(String[] args) {
		int[] A={100001};
		int[] B={100000};
		System.out.println(new Median_of_Two_Sorted_Arrays().findMedianSortedArrays(A, B));
	}
    public double findMedianSortedArrays(int A[], int B[]) {
        if((A.length+B.length)%2==1)
        	return findKth(A, B, (A.length+B.length)/2+1);
        else {
			return ((double)findKth(A, B, (A.length+B.length)/2)+findKth(A, B, (A.length+B.length)/2+1))/2;
		}
    }
    
    public double findKth(int A[], int B[], int k)
    {
    	double middle=0.0;
    	if(A.length>B.length)
    		return findKth(B, A, k);
    	if(A.length==0)
    		return (double)B[k-1];
    	if(k==1)
    		return Math.min(A[0], B[0]);
    	int divideA=Math.min(k/2, A.length);
    	int divideB=k-divideA;
    	if(A[divideA-1]==B[divideB-1])
    		return A[divideA-1];
    	if(A[divideA-1]<B[divideB-1])
    	{
    		int[] subA=new int[A.length-divideA];
    		int[] subB=new int[divideB];
    		for(int i=0,j=divideA;i<subA.length&&j<A.length;i++,j++)
    		{
    			subA[i]=A[j];
    		}
    		for(int i=0,j=0;i<subB.length&&j<divideB;i++,j++)
    		{
    			subB[i]=B[j];
    		}
    		middle=findKth(subA, subB, k-divideA);
    	}
    	else {
			int[] subB=new int[B.length-divideB];
			int[] subA=new int[divideA];
			for(int i=0,j=0;i<subA.length&&j<divideA;i++,j++)
			{
				subA[i]=A[j];
			}
			for(int i=0,j=divideB;i<subB.length&&j<B.length;i++,j++)
			{
				subB[i]=B[j];
			}
			middle=findKth(subA, subB, k-divideB);
		}
    	return middle;
    }
}
