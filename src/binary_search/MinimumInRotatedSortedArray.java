package binary_search;

/*
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
 * 
 * https://www.naukri.com/code360/problems/rotated-array_1093219?interviewProblemRedirection=true&search=minimum
 */
public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4};
        int result = findMinimum(arr);
        System.out.println("Minimum : "+ result);
    }

    static int findMinimum(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        int ans = arr[arr.length - 1];
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(mid > 0 && arr[mid] < arr[mid -1]){
                return arr[mid];
            }
            if(arr[mid] >= arr[low] && arr[mid] > arr[high]){
                low = mid + 1;
            }else{
                ans = arr[mid];
                high = mid - 1;
            }
        }
        return ans;
    }
}
