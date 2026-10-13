public class ArrayExample {
    public static boolean isSortedAscending(int[] arr) {
		/**
		for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Array is not sorted in ascending order
            }
        }
        return true; // Array is sorted in ascending order
		**/
		
		/**
        for (int i = 0; i < arr.length - 1; ) {
            if (arr[i] > arr[i + 1]) {
                return false; // Array is not sorted in ascending order
            }
            i++; // Increment the index
        }
        return true; // Array is sorted in ascending order
		**/
		
		
		for (int i = 0; ; ) {
			if (i >= arr.length - 1) return true;				
            if (arr[i] > arr[i + 1]) {
                return false; // Array is not sorted in ascending order
            }
			i++;
        }
    }

    public static void main(String[] args) {
		// Declare and initialize an array of integers
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
		int[] arr3 = {9};
		int[] arr4 = {};

        System.out.println("Array 1 is sorted in ascending order: " + isSortedAscending(arr1));
        System.out.println("Array 2 is sorted in ascending order: " + isSortedAscending(arr2));
        System.out.println("Array 3 is sorted in ascending order: " + isSortedAscending(arr3));
        System.out.println("Array 4 is sorted in ascending order: " + isSortedAscending(arr4));
    }
}





