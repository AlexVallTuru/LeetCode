import java.util.Arrays;

public class mergeSortedArray{

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int num:nums2){
            for(int i = 0; i < nums1.length; i ++){
                if(nums1[i] == 0){
                    nums1[i] = num;
                    break;
                }
            }
        }
        Arrays.sort(nums1);
    }

}