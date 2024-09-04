import java.util.Arrays;
import java.util.HashMap;

public class howManyNumbersAreSmallers {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        smallerNumbersThanCurrent(new int[] { 8, 1, 2, 2, 3 });

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int count = 0;

        int[] numsSorted = nums.clone();

        Arrays.sort(numsSorted);

        int n = nums.length;

        for(int i = 0; i < n / 2; i++){
            int temp = numsSorted[n - 1 -i];
            numsSorted[n-1 -i] = numsSorted[i];
            numsSorted[i] = temp;
        }

        HashMap<Integer, Integer> mapCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = i + 1; j < n; j++) {
                if (numsSorted[i] > numsSorted[j]) {
                    count++;
                }
            }
            mapCount.put(numsSorted[i], mapCount.getOrDefault(numsSorted[i], count));
        }

        for (int i = 0; i < n; i++) {
            nums[i] = mapCount.get(nums[i]);
        }

        return nums;
    }

}