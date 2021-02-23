// C# program to find Minimum
// number of jumps to reach end
using System;

class GFG {
	// Returns minimum number of
	// jumps to reach arr[h] from arr[l]
	static int minJumps(int[] arr, int l, int h)
	{
		// Base case: when source
		// and destination are same
		if (h == l)
			return 0;

		// When nothing is reachable
		// from the given source
		if (arr[l] == 0)
			return int.MaxValue;

		// Traverse through all the points
		// reachable from arr[l]. Recursively
		// get the minimum number of jumps
		// needed to reach arr[h] from these
		// reachable points.
		int min = int.MaxValue;
		for (int i = l + 1; i <= h && i <= l + arr[l]; i++) {
			int jumps = minJumps(arr, i, h);
			if (jumps != int.MaxValue && jumps + 1 < min)
				min = jumps + 1;
		}
		return min;
	}

	// Driver code
	public static void Main()
	{
		int[] arr = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
		int n = arr.Length;
		Console.Write("Minimum number of jumps to reach end is "
					+ minJumps(arr, 0, n - 1));
	}
}
