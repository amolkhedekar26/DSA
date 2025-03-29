package binary_search;

import java.util.ArrayList;

/*
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 * 
 * https://www.naukri.com/code360/problems/search-in-rotated-sorted-array_1082554
 */
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int result = search(arr, target);
        System.out.println("Element is present at index : " + result);
    }

    static int search(int[] arr, int target) {
        int minIndex = findMinimum(arr);
        System.out.println(minIndex);
        int ans = binarySearch(arr, 0, minIndex - 1, target);
        if (ans == -1) {
            ans = binarySearch(arr, minIndex, arr.length - 1, target);
        }
        return ans;
    }

    static int findMinimum(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] >= arr[low] && arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }

    static int binarySearch(int[] arr, int low, int high, int target) {
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

    /*
     * Using ArrayList
     */
    public static int search(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int minIndex = findMinimum(arr);
        int ans = binarySearch(arr, 0, minIndex - 1, k);
        if (ans == -1) {
            ans = binarySearch(arr, minIndex, arr.size() - 1, k);
        }
        return ans;
    }

    static int findMinimum(ArrayList<Integer> arr) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = arr.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid > 0 && arr.get(mid) < arr.get(mid - 1)) {
                return mid;
            }
            if (arr.get(mid) >= arr.get(low) && arr.get(mid) > arr.get(high)) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }

    static int binarySearch(ArrayList<Integer> arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == target) {
                return mid;
            } else if (target < arr.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
