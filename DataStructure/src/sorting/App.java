package sorting;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Bubble sort
        //selection sort
        //insertion sort
        //quick sort

        int[] numbers= new int[]{45, 12, 11, 10, 2, 5, 8};
        Arrays.sort(numbers);

        for(int i = 0 ;i< numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        selectionSort(numbers);

        for(int i = 0 ;i< numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
    }

    public static int[] bubbleSort(int[] numbers){
        // bubble sort O(n^2)
        for (int i=0; i< numbers.length; i++){
            for (int j=i ; j< numbers.length ; j++){
                if (numbers[i]> numbers[j]){
                    //swap
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static int[] selectionSort(int[] numbers){
        //Selection Sort
        int n = numbers.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (numbers[j] < numbers[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = numbers[min_idx];
            numbers[min_idx] = numbers[i];
            numbers[i] = temp;
        }

        return numbers;
    }
}
