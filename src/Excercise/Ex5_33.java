package Excercise;

public class Ex5_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int exam = 4;
		int count = 0;
		int init_num = 1;
		while (count < exam) {
			if (Perfect(init_num)) {
				System.out.println(init_num);
				count += 1;
				init_num += 1;
			} else {
				init_num += 1;
			}
		}

		// System.out.println(Perfect(6));
	}

	public static boolean Perfect(int a) {
		return a == SumOfFactor(a);
	}

	public static int SumOfFactor(int x) {
		int total = 0;

		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				total += i;
			}
		}
		return total;
	}
}
