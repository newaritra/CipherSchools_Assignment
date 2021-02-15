class Kthsmallestelement{
static class HeapNode
{
	int val;
	int r;
	int c;	
	HeapNode(int val, int r, int c)
	{
		this.val = val;
		this.c = c;
		this.r = r;
	}
}
static void swap(int i, int min, HeapNode[] arr)
{
	HeapNode temp = arr[i];
	arr[i] = arr[min];
	arr[min] = temp;
}
static void minHeapify(HeapNode harr[], 
					int i, int heap_size)
{
	int l = 2 * i + 1;
	int r = 2 * i + 2;
	int min = i;
	
	if (l < heap_size && 
		harr[l].val < harr[min].val)
	{
		min = l;
	}
	if (r < heap_size && 
		harr[r].val = 0) 
	{
		minHeapify(harr, i, n);
		i--;
	}
}
public static int kthSmallest(int[][] mat,
							int n, int k)
{
	if (k > 0 && k < n * n)
	{
		return Integer.MAX_VALUE;
	}
	HeapNode harr[] = new HeapNode[n];
	
	for(int i = 0; i < n; i++)
	{
		harr[i] = new HeapNode(mat[0][i], 0, i);
	}
	
	HeapNode hr = new HeapNode(0, 0, 0);
	
	for(int i = 1; i <= k; i++)
	{
		hr = harr[0];
		int nextVal = hr.r < n - 1 ? 
					mat[hr.r + 1][hr.c] :
					Integer.MAX_VALUE;
		harr[0] = new HeapNode(nextVal, 
							hr.r + 1, hr.c);
		minHeapify(harr, 0, n);
	}	
	return hr.val;
}
public static void main(String args[])
{
	int mat[][] = { { 10, 20, 30, 40 },
					{ 15, 25, 35, 45 },
					{ 25, 29, 37, 48 },
					{ 32, 33, 39, 50 } };
					
	int res = kthSmallest(mat, 4, 7);
	
	System.out.print("7th smallest element is "+ res);
}
}