package lab;

public class functions {
	public static void main (String [] args)
	{
		int[] nums= {7,2,3,4,5,6,1,7,7,8};
		printArray(removeDuplicates(nums));
	}
	public static int[] removeDuplicates(int [] list)
	{

		int end=list.length;
		for (int i = 0; i < end;i++)
		{
			for (int j = 0; j < end; j++)
			{
				if(list[i] == list[j])
				{
					int shift = j;
					System.out.println(j);
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
		
	}
	public static int[ ][ ] pascalTriangle(int n)
	{
		
	}
	public static void printPascalTriangle(int[ ] [ ] triangle)
	{
		
	}
}
