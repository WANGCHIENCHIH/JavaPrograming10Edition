package Excercise;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] origin_array = {5,7,9,2,-1,0,6,2,-3};
		
		printList(origin_array);
		selectsort(origin_array);
	}
	
	public static void selectsort(int []list1) {
		
		
		for(int i = list1.length-1;i>0;i--) {
			int max_element_index = i;
			int max_element = list1[max_element_index];
			for(int j = 0;j<i;j++) {
				
				if(list1[j]>max_element) {
					max_element_index=j;
					max_element=list1[max_element_index];
				}
			}
			if(max_element_index!=i) {
				int temp=list1[max_element_index];
				list1[max_element_index]=list1[i];
				list1[i]=temp;
				printList(list1);
			}
			
		}
	}
	public static void printList(int []list1) {
		for (int nums :list1) {
			System.out.printf("%3d",nums);
		}
		System.out.println();
	}

}
