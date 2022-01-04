package Excercise;
import java.util.Scanner;

public class Ex6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input number:");
		int input_number = input.nextInt();
		System.out.printf("Input number:%d is Palindrome? %b\n",input_number,isPalindrome(input_number));
		input.close();
	}
	
	public static int reverse(int number) {
		int result = 0;
		while(number>0) {
			result = result *10 +(number)%10 ;
			number /= 10;
		}
		return result;
	}
	
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}

}
