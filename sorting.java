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

        System.out.println("-----------------------------------------------------");
		System.out.println("\n\nBefore Sorting - Selection Sort");
		int [] array = {1,5,7,2,3,4,9};
        //call to sort array passed in param

		for(int i = 0; i < array.length-1;i++){
            System.out.println(array[i]);
        }
        selectSort(array);
        //for loop prints array int by int after sorted

		System.out.println("\n\n--------------------------------------------------");
		System.out.println("\n\nAfter Sorting - Selection Sort");
        for(int i = 0; i < array.length-1;i++){
            System.out.println(array[i]);
        }
		
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

    public static void selectSort(int[]arr){
        int  minPointer, minVal;
        //for loop from 0 to second to last position
        for(int startScan = 0; startScan<arr.length-1;startScan++){
            //minPointer initially assigned to 0 then after for loop it is incremented by 1
            minPointer=startScan;
            //minVal assigned to number at current index value
            minVal = arr[startScan];
            //find the smallest then the next smallest then next smallest until sorted
            for(int i = startScan+1; i < arr.length; i++){
            //check to see if arr at positon i is less than the min val  
                if(arr[i]<minVal){
                    //if arr at the i pos is less than current min val
                    //then assign it to min value
                    minVal = arr[i];
                    //set minPointer to i then go back to for loop if less than arr.length
                    minPointer = i;
                }
            }
           
            //the arr at [minPointer] gets arr at[startScan]
            arr[minPointer] = arr[startScan];
            //assign minVal to arr[startScan]
            arr[startScan] = minVal;
        }
    }

	

}