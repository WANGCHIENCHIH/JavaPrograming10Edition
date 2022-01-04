package Excercise;
import java.lang.Math;
public class Ex6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0,iter_num=1;
		while(iter_num <= 12000) {
			if(isPrime(iter_num)) {
				System.out.printf("%6d",iter_num);
				count++;
				if(count%10==0) {
					System.out.println("");
				}
			}
			
			iter_num++;
		}
	}
	
	public static boolean isPrime(int number) {
		if (number == 1 ){
			return false;
			}
		if (number == 2 ){
			return true;
			}
		for(int i =2;i<=Math.sqrt(number);i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
		
	}

}
