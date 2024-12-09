package algorithms;

public class searching {

    public static int binarySearch(int[] array, int target) {
        // The search begins by setting the left and right boundaries
        // of the array. The middle element is compared with the target.
        // If the middle element equals the target, the index is returned.
        // If the target is smaller, the search continues in the left half.
        // If the target is larger, the search continues in the right half.
        // This process repeats until the target is found or the boundaries
        // overlap, indicating the target is not in the array.

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
