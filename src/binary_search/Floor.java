package binary_search;

/*
 * https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
 */
public class Floor {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 10, 10, 12, 19 };
        int ceil = findFloor(arr, 0);
        System.out.println("Ceil -> " + ceil);
    }

    static int findFloor(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MIN_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (n >= arr[mid]) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(ans == Integer.MIN_VALUE) return -1;
        return ans;
    }
}
