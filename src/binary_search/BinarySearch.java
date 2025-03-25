package binary_search;

/*
 * https://leetcode.com/problems/binary-search/description/
 * 
 * https://www.naukri.com/code360/problems/binary-search_972?leftPanelTabValue=PROBLEM&count=25&page=1&search=search&sort_entity=order&sort_order=ASC&customSource=studio_nav
 */
public class BinarySearch {
    public static void main(String[] args) {
        // Create an array of integers
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // Target value to search
        int target = 5;
        // Call the binary search algorithm
        int result = binarySearch(arr, target);
        // Print the result
        System.out.println("The target value is at index: " + result);
    }

    // Binary search algorithm
    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
