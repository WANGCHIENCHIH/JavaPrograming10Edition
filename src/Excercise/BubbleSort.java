package Excercise;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] origin_array = {5,7,9,2,-1,0,6,2,-3};
		
		printList(origin_array);
		bubblesort(origin_array);
	}
	
	public static void bubblesort(int []list1) {
		for(int i = list1.length-1;i>0;i--) {
			for(int j = 0;j<i;j++) {
				if(list1[j]>list1[j+1]) {
					//swap
					int temp=list1[j+1];
					list1[j+1]=list1[j];
					list1[j]=temp;
				}
			}
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
