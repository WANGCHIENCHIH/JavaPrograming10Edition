package Excercise;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] origin_array = {5,7,9,2,-1,0,6,2,-3};
		
		printList(origin_array);
		insertionsort(origin_array);
	}
	
	public static void insertionsort(int [] list1) {
		
		for(int i =1;i<list1.length;i++) {
			int current=list1[i];
			int j=i-1;
			while(j> -1 && list1[j]>current) {
				
				list1[j+1]=list1[j];
				j--;
			}
			list1[j+1]=current;
			printList(list1);
		}
	}
	
	public static void printList(int []list1) {
		for (int nums :list1) {
			System.out.printf("%3d",nums);
		}
		System.out.println();
	}

}
