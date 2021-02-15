public class Meeting { 

	static boolean everMeet(int x1, int x2, int v1, int v2) { 
		if (x1 < x2 && v1 <= v2) { 
			return false; 
		} 
		if (x1 > x2 && v1 >= v2) { 
			return false; 
		} 
		if (x1 < x2) { 
			swap(x1, x2); 
			swap(v1, v2); 
		} 
		return ((x1 - x2) % (v1 - v2) == 0); 
	} 

	static void swap(int a, int b) { 
		int t = a; 
		a = b; 
		b = t; 
	} 

	public static void main(String[] args) { 
		int x1 = 7, v1 = 7, x2 = 3, v2 = 9; 
		if (everMeet(x1, x2, v1, v2)) { 
			System.out.printf("Yes"); 
		} else { 
			System.out.printf("No"); 
		} 
	} 
}  