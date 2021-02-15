class SearchSortedMatrix {
	private static void search(int[][] mat, 
									int n, int x)
	{
		int i = 0, j = n - 1; 
		while (i < n && j >= 0) 
		{
			if (mat[i][j] == x) 
			{
				System.out.print("n Found at " + 
									i + " " + j);
				return;
			}
			if (mat[i][j] > x)
				j--;
			else
				i++;
		}

		System.out.print("n Element not found");
		return;
	}
	public static void main(String[] args)
	{
		int mat[][] = { { 13, 33, 43, 83 },
						{ 45, 65, 75, 95 },
						{ 33, 44, 66, 88 },
						{ 32, 46, , 50 } };

		search(mat, 4, 66);
	}
}