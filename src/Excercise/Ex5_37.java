package Excercise;

public class Ex5_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DecToBin(7));
		System.out.println(DecToBin(8));
		System.out.println(DecToBin(9));
		System.out.println(DecToBin(10));

	}

	public static String DecToBin(int a) {
		String target_num = "";
		while (a != 0) {
			target_num += String.valueOf((a % 2));
			a /= 2;
		}
		return ReverseString(target_num);
	}
	public static String ReverseString(String src_str) {
		String target_str="";
		
		for(int i =src_str.length()-1;i>=0;i--) {
			target_str += src_str.charAt(i);
		}
		return target_str;
	}

}
