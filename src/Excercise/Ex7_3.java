package Excercise;

import java.util.Scanner;

public class Ex7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input number between 1-50:");
		Scanner input = new Scanner(System.in);
		String [] input_str = input.nextLine().split(" ");
		
		
		//get element to array
		//init array
		int [] count_per_nums =new int[50];
		for(int i = 0;i<count_per_nums.length;i++) {
			count_per_nums[i]=0;
		}
		
		//
		for(String nums:input_str) {
			if(Integer.parseInt(nums) == 0) {
				break;
			}
			
			count_per_nums[Integer.parseInt(nums)-1]+=1;
		}
		
		//print result
		for(int i = 0;i<count_per_nums.length;i++) {
			if(count_per_nums[i]!=0 && count_per_nums[i]>1) {
				System.out.printf("%2d occurs %d times\n", i+1,count_per_nums[i]);
			}
			else if(count_per_nums[i]!=0 && count_per_nums[i]==1) {
				System.out.printf("%2d occurs %d time\n", i+1,count_per_nums[i]);
			}
		}
		
		input.close();
	}
	
	

}
