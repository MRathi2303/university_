package iilm.java.practicals;
/*
Write a program that contains an array of 10 elements and sorts it using the following techniques:
        1. Bubble Sort
        2. Selection Sort
        3. Insertion Sort
*/
public class Sorting {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIdx]) minIdx = j;
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 45, 78, 56};

        // Bubble Sort
        int[] bubbleSorted = arr.clone();
        bubbleSort(bubbleSorted);
        System.out.println("Bubble Sorted: " + java.util.Arrays.toString(bubbleSorted));

        // Selection Sort
        int[] selectionSorted = arr.clone();
        selectionSort(selectionSorted);
        System.out.println("Selection Sorted: " + java.util.Arrays.toString(selectionSorted));

        // Insertion Sort
        int[] insertionSorted = arr.clone();
        insertionSort(insertionSorted);
        System.out.println("Insertion Sorted: " + java.util.Arrays.toString(insertionSorted));
    }
}
