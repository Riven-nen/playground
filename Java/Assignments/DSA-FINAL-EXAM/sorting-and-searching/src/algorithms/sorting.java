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
