package Excercise;

public class Ex5_16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorization(5984632);//2,2,2,83,9013
		

	}
	
	public static void factorization(int a) {
		int divisor = 2;
		if (a==1 || a==0) {
			System.out.println(a);
		}
		while (a>=divisor){
			if (a% divisor == 0 ) {
				System.out.println(divisor);
				a /=divisor;
			}
			else {
				divisor+=1;
			}
		}
	}
}
