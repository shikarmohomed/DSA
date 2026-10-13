import java.util.Scanner;

public class ArrayOperations {
    private int[] arr;
    private int size;

    // Constructor
    public ArrayOperations(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    // Method to accept array elements from user
    public void acceptElements() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++) {
            System.out.print("Enter the value for index " + i + " :");
            arr[i] = sc.nextInt();
        }
    }

    // Method to display array elements
    public void displayElements() {
        System.out.print("Array elements are: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Add new line after printing array
    }

    // Method to find minimum value in the array
    public int findMinimum() {
        int min = arr[0];
        for(int i = 0; i < size; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Method to display array elements in reverse order
    public void displayReverse() {
        System.out.print("Array elements in reverse order are: ");
        for(int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to count and print frequency of each element
    public void printFrequency() {
        System.out.println("Frequency of each element:");
        boolean[] counted = new boolean[size]; // already print pannirukoma nu track pannurathukku
        for(int i = 0; i < size; i++) {
            if(counted[i]) continue; // ithu already munnadi count panniyachu, so skip pannurom
            int count = 0;
            for(int j = 0; j < size; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }

    // Method to merge this array (assumed sorted) with another sorted array
    public int[] mergeSorted(int[] other) {
        int[] merged = new int[this.size + other.length];
        int p = 0, q = 0, k = 0;

        while(p < this.size && q < other.length) {
            if(this.arr[p] <= other[q])
                merged[k++] = this.arr[p++];
            else
                merged[k++] = other[q++];
        }
        // oru array mudinjadhum, matha array la migunthadhu direct copy pannurom
        while(p < this.size)
            merged[k++] = this.arr[p++];
        while(q < other.length)
            merged[k++] = other[q++];

        return merged;
    }

    // Method to sort elements in ascending order using bubble sort
    public int[] bubbleSort() {
        int[] result = arr.clone(); // original array-a maatama copy vechu sort pannurom
        for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - 1 - i; j++) {
                if(result[j] > result[j+1]) {
                    // adjacent elements swap pannurom
                    int temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = temp;
                }
            }
        }
        return result;
    }

    // Method to sort elements in ascending order using selection sort
    public int[] selectionSort() {
        int[] result = arr.clone();
        for(int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < size; j++) {
                if(result[j] < result[minIndex]) {
                    minIndex = j;
                }
            }
            // minimum element-a current position-ku kondu varom
            int temp = result[minIndex];
            result[minIndex] = result[i];
            result[i] = temp;
        }
        return result;
    }

    // Helper method to print any array with a label
    public void printArray(String label, int[] array) {
        System.out.print(label + ": ");
        for(int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Main method to test the class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array length is: ");
        int A = sc.nextInt();

        // Create an object of ArrayOperations
        ArrayOperations arrayOps = new ArrayOperations(A);

        // Perform operations using methods
        arrayOps.acceptElements();
        arrayOps.displayElements();

        int minValue = arrayOps.findMinimum();
        System.out.println("Minimum value in the array is: " + minValue);

        arrayOps.displayReverse();

        arrayOps.printFrequency();

        // Merge with another sorted array (example)
        System.out.println("\n--- Merge Two Sorted Arrays ---");
        int[] otherArray = {2, 4, 6, 8, 10};
        int[] merged = arrayOps.mergeSorted(otherArray);
        arrayOps.printArray("Merged sorted array", merged);

        System.out.println("\n--- Bubble Sort ---");
        int[] bubbleSorted = arrayOps.bubbleSort();
        arrayOps.printArray("Bubble sorted array", bubbleSorted);

        System.out.println("\n--- Selection Sort ---");
        int[] selectionSorted = arrayOps.selectionSort();
        arrayOps.printArray("Selection sorted array", selectionSorted);
    }
}