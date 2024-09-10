//import java.util.Arrays;

public class binarySearch{

    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
    
    }
 
    public static int search(int[] nums, int target) {
        
        //Arrays.binarySearch(nums, target);

        int right = nums.length -1;
        int left = 0;
        
        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }

}