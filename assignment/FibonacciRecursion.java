package omniwyse.assignment;

public class FibonacciRecursion {
    static int fib(int n) 
    { 
    if (n <= 1) { 
       return n; 
    }
    return fib(n-1) + fib(n-2); 
    } 

}
