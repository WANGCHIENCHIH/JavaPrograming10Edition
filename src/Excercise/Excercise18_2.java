package Excercise;

public class Excercise18_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long index_number = 4;
		System.out.printf("use recursive method:\n index %d of fib is %s\n",index_number,fib_use_recursive(index_number));
		System.out.printf("use iter method:\n index %d of fib is %s\n",index_number,fib_use_iter(index_number));
	}
	
	
	public static long fib_use_recursive(long n) {
		if (n == 0 ||n==1) {
			return n;
		}
		else {
			return fib_use_recursive(n-2)+fib_use_recursive(n-1);
		}
	}
	
	public static long fib_use_iter(long n) {
		long f0 = 0;
		long f1 = 1;
		long currentFib = 0;
		
		for (int i =1;i<=n;i++) {
			currentFib = f0+f1;
			f0 = f1;
			f1 = currentFib;
		}
		return f0;
	}
}
