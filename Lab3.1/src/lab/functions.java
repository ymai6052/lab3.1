package lab;

public class functions {
	public static void main (String [] args)
	{
		int[] nums= {7,2,3,4,5,6,1,7,7,8};
		int[] nums2 = {4,7,8,2,6,7,8,9,2,1};
		//printArray(removeDuplicates(nums));
		//print2dArray(productArray(nums, nums2));
		//print2dArray(pascalTriangle(5));
		printPascalTriangle(pascalTriangle(5));
		
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
	public static int[][] productArray(int[] arr1, int[] arr2)
	{
		int [][] newarray = new int[arr1.length][arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				newarray[i][j]=arr1[i]*arr2[j];
			}
		}
		return newarray;
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
		// System.out.println();
	}
	public static int[ ][ ] pascalTriangle(int n)
	{
		int [][] newarray = new int[n][];
		for (int i = 0; i < n; i++)
		{
			newarray[i] = new int[i+1];
			for(int j=0;j<i+1;j++)
			{
				if(i==0||j<1)
					newarray[i][j]=1;
				else if(i>2)
				{
					System.out.print(i);
					newarray[i][j]=newarray[i-1][j-1]+newarray[i-1][j];
					
				}
					newarray[i][j]=1;
					//else
					//newarray[i][j]=newarray[i-1][j-1]+newarray[i-1][j];
					
			}
		}
		return newarray;
	}
	public static void printPascalTriangle(int[ ] [ ] triangle)
	{
		for (int i = 0 ; i < triangle.length; i++)
		 {
			 for (int j = 0; j < triangle[i].length; j++)
			 {
				 System.out.print(triangle[i][j]+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
	}
}
