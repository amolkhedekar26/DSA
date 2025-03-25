package binary_search;

/* 
 * https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
 * 
 * https://www.naukri.com/code360/problems/occurrence-of-x-in-a-sorted-array_630456?leftPanelTabValue=PROBLEM&count=25&page=1&search=&sort_entity=order&sort_order=ASC
 */
public class NumberOfOccurences {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 2;
        int result =  findNumberOfOccurences(arr, arr.length, target);
        System.out.println("Number Of Occurences: " + result);
    }

    static int findNumberOfOccurences(int arr[], int n, int target){
        int[] ans = searchRange(arr, target);
        if(ans[0] == -1){
            return 0;
        }
        return ans[1] - ans[0] + 1;
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        
        // For First Occurence
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/ 2;
            if(nums[mid] == target){
                ans[0] = mid;
                high = mid - 1;
            }else if(target < nums[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        // For Last Occuerence
        low = 0; 
        high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/ 2;
            if(nums[mid] == target){
                ans[1] = mid;
                low = mid + 1;
            }else if(target < nums[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }
}
