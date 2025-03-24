package binary_search;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = { 1,2,4,5,6,7,8,9};
        int target = 3;
        int result = searchInsert(arr, target);
        System.out.println("Search Insert Position is : "+ result);
    }

    static int searchInsert(int[] arr, int target) {
        int low =  0;
        int high =  arr.length - 1;;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(target < arr[mid]){
                high = mid - 1;            
            }else{
                low = mid + 1;
            }
        }
        return low;   
    }
}
