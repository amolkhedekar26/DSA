package binary_search;

/*
 * https://www.geeksforgeeks.org/problems/ceil-in-a-sorted-array/0
 */
public class Ceil {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 4, 4, 4, 4, 10 };
        int ceil = findCeil(arr, 4);
        System.out.println("Ceil -> " + ceil);
    }

    static int findCeil(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (n <= arr[mid]) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}
