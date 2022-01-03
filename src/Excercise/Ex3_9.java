package Excercise;

public class Ex3_9 {

	
	public static String ISBNTEN(String x) {
		int count_num=0;
		for(int i=0;i<x.length();i++) {
			
			count_num+=(Character.getNumericValue(x.charAt(i))*(i+1));
		}
		count_num%=11;
		
		if (count_num == 10) {
			return x+"X";
		}
		else {
			return x+String.valueOf(count_num);
		}
	}
}
