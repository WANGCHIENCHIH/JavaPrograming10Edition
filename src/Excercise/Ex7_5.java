package Excercise;

import java.util.Scanner;

public class Ex7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input number between 1-50:");
		Scanner input = new Scanner(System.in);
		String [] input_str = input.nextLine().split(" ");
		
		int [] even_and_odd = {0,0};
		
		for(String nums :input_str) {
			if(Integer.parseInt(nums) == 0 ) {
				continue;
			}
			else if(Integer.parseInt(nums) % 2 == 0 ) {
				even_and_odd[0]+=1;
			}
			else {
				even_and_odd[1]+=1;
			}
		}
		System.out.printf("number of odd:%4d\n",even_and_odd[1]);
		System.out.printf("number of even:%3d\n",even_and_odd[0]);
		
		input.close();
	}

}
