# Answer

by Pimwalun Witchawanitchanun (5910546686)

### 4.1 Explain why this function is so slow, even for fairly small values of n (like n=45 or n=50). 

	public static long fibonacci(int n) {
	// the base case
	if (n < 2) return 1;
	// the recursive step
	return fibonacci(n-1) + fibonacci(n-2);
	}
 	
   