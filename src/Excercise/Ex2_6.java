package Excercise;
import java.util.Scanner;
public class Ex2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int input_num = input.nextInt();
		System.out.print(countMuti(input_num));
		input.close();
		
	}
	
	public static int countMuti(int input_num) {
		int answer=1;
		while(input_num>0) {
			answer *=(input_num % 10);
			input_num = input_num/10;
		}
		return answer;
	}

}
