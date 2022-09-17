import java.util.Arrays;

public class tester {

    public static void main (String[] args) {

        insertionTest();
        selectionTest();

        System.out.println("Both tests have passed successfully");
        
    }

    private static void insertionTest() {
        int [] arr1 = {3, 2, 1};
        int [] newArray = {1, 2, 3};
        sorting.insertionSorting(arr1);
        assert Arrays.equals(arr1, newArray);
    }

    private static void selectionTest() {
        int [] arr2 = {3, 1, 2};
        int [] newArray = {1, 2, 3};
        sorting.selectSort(arr2);
        assert Arrays.equals(arr2, newArray);
    }

    
}
