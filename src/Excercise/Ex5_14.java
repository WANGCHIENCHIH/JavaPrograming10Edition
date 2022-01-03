package Excercise;

public class Ex5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(GCD(121,319));
		System.out.println(GCD(15549832,215684674));

	}
	
	public static int GCD(int a,int b) {
		
		while (a%b>0) {
			
			/*
			  除數、被除數、餘數
			 */
			int temp = b ;
			b=a%b;
			a=temp;
			//System.out.printf("a=%d,b=%d\n" ,a,b);
					
		}
		return b;
	}

}
