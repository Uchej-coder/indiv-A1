public class sorting {
	public static void main (String args[]) {
		// System.out.println(78);
		
		int arr1 [] = new int [10];
		for (int i = 0; i < 10; i++) {
			arr1[i] = (int)(Math.random() * 10 + 1);
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("\n\nBefore Sorting - Insertion Sort");
		for (int i = 0; i < arr1.length; i++)
			System.out.println(arr1[i]);
		
		insertionSorting(arr1);
		
		System.out.println("\n\n--------------------------------------------------");
		System.out.println("\n\nAfter Sorting - Insertion Sort");
		for (int i = 0; i < arr1.length; i++)
			System.out.println(arr1[i]);
		System.out.println("-----------------------------------------------------");

		
	}
	
	public static void insertionSorting(int[] data) {
		for (int i = 1; i < data.length; i++) {
			int j;
			j = i;
			while (j > 0  && data[j-1] > data[j]) {
				int tmp = data[j];
				data[j] = data[j-1];
				data[j-1] = tmp;
				j--;
			}
		}
	}

	

}