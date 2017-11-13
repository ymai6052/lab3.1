package lab;

public class functions {
	public static void main (String [] args)
	{
		int[] nums= {7,2,3,4,5,6,1,7,7,8};
		int [] nums2 = {3,7,8,2,6,7,8,9,2,1};
		//printArray(removeDuplicates(nums));
		print2dArray(productArray(nums, nums2));

	}
	public static int[] removeDuplicates(int [] list)
	{

		int end=list.length;
		for (int i = 0; i < end;i++)
		{
			for (int j = i+1; j < end; j++)
			{
				if(list[i] == list[j])
				{
					int shift = j;
					for (int x = j+1; x < end; x++, shift++)
					{
						list[shift] = list[x];
					}
					end--;
					j--;
				}
			}
		}
		int [] newlist = new int[end];
		
		for(int z=0;z<end;z++)
		{
			newlist[z]=list[z];
		}
		return newlist;
	}
	public static void printArray(int[] Arr)
	{
		for(int i=0;i<Arr.length;i++)
		{
			System.out.print(Arr[i]);
		}
		System.out.println();
	}
	public static void print2dArray(int [][] Arr )
	{
		
		 for (int i = 0 ; i < Arr.length; i++)
		 {
			 for (int j = 0; j < Arr.length; j++)
			 {
				 System.out.print(Arr[j][i]+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
	}
	public static int[][] productArray(int[] arr1, int[] arr2)
	{
		int [][] newarray = new int[arr1.length][arr2.length
		                                         ];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i;j<arr2.length;j++)
			{
				newarray[i][0] = arr1[i]*arr2[i];
				newarray[0][j] = arr2[j]*arr2[j];
			}
		}
		return newarray;
		
	}
	public static int[ ][ ] pascalTriangle(int n)
	{
		
	}
	public static void printPascalTriangle(int[ ] [ ] triangle)
	{
		
	}
}
