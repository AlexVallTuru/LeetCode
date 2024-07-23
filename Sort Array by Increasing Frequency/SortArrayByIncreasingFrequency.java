import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class SortArrayByIncreasingFrequency {

    public static void main(String[] args) {

        int[] numeros = new int[] { 2, 3, 1, 3, 2 };
        numeros = frequencySort(numeros);

    }

    public static int[] frequencySort(int[] nums) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : nums) {
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }

        Map<Integer, Integer> frequencyMapSorted = frequencyMap.entrySet()
                .stream()
                .sorted((entry1, entry2) -> {
                    int freqComparasion = entry1.getValue().compareTo(entry2.getValue());
                    if (freqComparasion != 0) {
                        return freqComparasion;
                    } else {
                        return entry2.getKey().compareTo(entry1.getKey());
                    }
                })
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        int contador = 0;
        int[] numberSortedArray = new int[nums.length];
        for (Map.Entry<Integer, Integer> entry : frequencyMapSorted.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            for (int i = 0; i < value; i++) {
                numberSortedArray[contador++] = key;
            }
        }
        return numberSortedArray;
    }
}
// RESULT = [1,3,3,2,2]