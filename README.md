# Answer

by Pimwalun Witchawanitchanun (5910546686)

### 4.1 Explain why this function is so slow, even for fairly small values of n (like n=45 or n=50). 

	public static long fibonacci(int n) {
	// the base case
	if (n < 2) return 1;
	// the recursive step
	return fibonacci(n-1) + fibonacci(n-2);
	}
 	
   Because when we call the method repeatedly, it will work the same way repeatedly.
   For example, if n = 5, we are calculating fibonacci(2) 3 times. If n increases, we will calculating 
   the more fibonacci(2) increases.