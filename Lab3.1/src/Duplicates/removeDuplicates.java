package Duplicates;

public class removeDuplicates {
	public static void main (String [] args)
	{
		int[] nums= {1,2,3,4,5,6,7,7,8};
		System.out.print(removeDuplicates(nums));
	}
	public static int[] removeDuplicates(int [] list)
	{
		int x = list[0];
		int[] arr= new int[list.length-1];
		for (int i = 1; i < list.length;i++)
		{
			if(list[i] == x)
			{
			}
			else
			{
				arr[i]=list[i];
			}
		}
		return arr;
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
