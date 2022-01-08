package Excercise;
import java.math.*;

public class CompareFactorial {

	public static void main(String[] args) {
		
		long testnum = 50;
		
		
		// implement_factorial_use_recursive
		long start_time = System.currentTimeMillis();
		BigInteger answer = factorial_use_recursive(testnum);
		long end_time = System.currentTimeMillis();
		System.out.printf("the answer of %d! is %s\n",testnum, answer);
		System.out.printf("total cost time:%d\n",end_time-start_time);
		
		
		// implement_factorial_use_loop
		start_time = System.currentTimeMillis();
		BigInteger answer2 = factorial_use_loop(testnum);
		end_time = System.currentTimeMillis();
		System.out.printf("the answer of %d! is %s\n",testnum, answer2);
		System.out.printf("total cost time:%d\n",end_time-start_time);
		
	}

	public static BigInteger factorial_use_recursive(long n) {
		BigInteger result = BigInteger.ONE;
		if (n == 0) {
			return result;
		}
		else {
			result =BigInteger.valueOf(n).multiply(factorial_use_recursive(n - 1));//n*n-1
		}
		return result ;
	}

	public static BigInteger factorial_use_loop(long n) {
		BigInteger ans = BigInteger.ONE;
		
		for (long i = 1; i <= n; i++) {
			ans=ans.multiply(BigInteger.valueOf(i));
			}
		
		return ans;
	}

}
