import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class findIfArrayCanBeSorted {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

    }

    public boolean canSortArray(int[] nums) {

        // Paso 1: Agrupar por cantidad de bits
        Map<Integer, List<Integer>> groupNums = new HashMap<>();

        for (Integer num : nums) {
            int setBits = Integer.bitCount(num);
            if (!groupNums.containsKey(setBits)) {
                groupNums.put(setBits, new ArrayList<Integer>());
            }
            groupNums.get(setBits).add(num);
        }

        // Paso 2: Ordenar Cada grupo
        List<Integer> sortedIntegers = new ArrayList<>();
        List<Integer> sortedBitGroups = new ArrayList<>(groupNums.keySet());
        Collections.sort(sortedBitGroups);

        for (int count : sortedBitGroups) {
            List<Integer> group = groupNums.get(count);
            Collections.sort(group);
            sortedIntegers.addAll(group);
        }

        // Paso 3: Realizar la comparacion de arrays:
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (sortedIntegers.get(i) != nums[i]) {
                return false;
            }
        }
        return true;
    }
}
