class fibonacci
{
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
    static int factorial(int n) 
    { 
        int res = 1, i; 
        for (i = 2; i <= n; i++) 
            res *= i; 
        return res; 
    } 
    public static void main (String args[])
    {
    int n = 9;
    System.out.println(fib(n));
    System.out.println(factorial(n));	
    }
}