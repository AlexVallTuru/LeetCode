import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class findDiffTwoArr {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

    }
    
    // All the repeated code would be functions, but it slows down time.
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> setNums1 = new HashSet<>();
        Set<Integer> setNums2 = new HashSet<>();

        for (int num : nums1) {
            setNums1.add(num);
        }
        for (int num : nums2) {
            setNums2.add(num);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int num : setNums1) {
            if (!setNums2.contains(num)) {
                list1.add(num);
            }
        }

        for (int num : setNums2) {
            if (!setNums1.contains(num)) {
                list2.add(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);

        return result;
    }
}