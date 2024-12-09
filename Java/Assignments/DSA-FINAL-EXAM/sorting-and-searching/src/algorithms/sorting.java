package algorithms;

public class sorting {
    
    /*
     * 1. Insertion
     * 2. Selection
     * 3. Bubble
     * 4. Merge
     * 5. Quick
     * 6. Shell
     * 7. Radix
     * 8. Bucket
    */

    // Insertion
    public static int[] insertion(int[] array) {
        // Start with index 0, incrementing for each iteration.
        // The current index value is then compared to the preceding
        // values with comparison operators, it will shift itself for each
        // time the preceding value is greater than the current value
        // and stop once the current value is greater than the preceding value
        // meaning it has found its place in the array.

        for (int i = 1; i < arr.length; i++) {
            int currValue = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currValue) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currValue;
        }
    }

    // Selection Sort - compact code ver. (my ver.)
    public static int[] selection(int[] array) {

        // Start with index 0, then simply go through the list
        // afterwards compare the current index element
        // through the list and find the lowest value,
        // once at the end replace the lowest with the 
        // current index element.

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    // Switching the value of 2 Variables without the use of a temporary variable.
                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                }
            }
        }

        return array;
    }
}
