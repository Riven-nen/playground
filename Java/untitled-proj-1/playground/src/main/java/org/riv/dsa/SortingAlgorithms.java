package org.riv.dsa;

public class SortingAlgorithms {
    
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    // Make methods for String[] first, ArrayList later
    public static int[] selection(int[] array) {

        // Start with index 0, then simply go through the list
        // afterwards compare the current index element
        // through the list and find the lowest value
        // once at the end replace the lowest with the 
        // current index element

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                    
                }
            }
        }

        return array;
    }
}
