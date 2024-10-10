package SearchInsertPosition;

public class searchInsertPosition {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        searchInsertPosition s = new searchInsertPosition();
        s.searchInsert(new int[]{1,3,5,6}, 5);

    }

    public int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length -1;

        while (left <= right) {     
            
            int mid = left + ( right - left ) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return left;
    }

}