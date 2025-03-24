package binary_search;

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println("First and Last Positions are "+ Arrays.toString(result));
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
